package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.ineuron.dto.BlogData;
import in.ineuron.util.JdbcUtil;

public class BlogDaoImpl implements IBlogDao {

	private Connection connection;
	private PreparedStatement pstmt;
	private ResultSet resultSet;

	@Override
	public String insertBlogData(BlogData data) {
		String status = null;
		int rowAffected = 0;
		try {
			connection = JdbcUtil.getConnection();

			if (connection != null) {
				String insertQuery = "insert into blog (title,description,content) values(?,?,?)";
				pstmt = connection.prepareStatement(insertQuery);
			}

			if (pstmt != null) {

				pstmt.setString(1, data.getBlogTitle());
				pstmt.setString(2, data.getBlogDescription());
				pstmt.setString(3, data.getContent());

				rowAffected = pstmt.executeUpdate();
			}

			if (rowAffected == 1)
				status = "success";
			else
				status = "failure";

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public BlogData getheBlogDataById(Integer id) {
		BlogData data = null;

		try {
			connection = JdbcUtil.getConnection();

			if (connection != null) {
				String selectquery = "select title,description,content from blog where id=?";
				pstmt = connection.prepareStatement(selectquery);
			}

			if (pstmt != null) {
				pstmt.setInt(1, id);
				resultSet = pstmt.executeQuery();
			}
			if (resultSet != null) {
				data = new BlogData();
				if (resultSet.next()) {
					data.setId(id);
					data.setBlogTitle(resultSet.getString(1));
					data.setBlogDescription(resultSet.getString(2));
					data.setContent(resultSet.getString(3));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	@Override
	public Integer findIdOfLatestInsertedRow() {
		Integer blogId = null;
		try {
			connection = JdbcUtil.getConnection();

			if (connection != null) {
				String selectquery = "select id from blog order by id desc limit 1";
				pstmt = connection.prepareStatement(selectquery);
			}

			if (pstmt != null) {
				resultSet = pstmt.executeQuery();
			}
			if (resultSet != null) {
				if (resultSet.next()) {
					blogId = resultSet.getInt(1);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return blogId;
	}

}
