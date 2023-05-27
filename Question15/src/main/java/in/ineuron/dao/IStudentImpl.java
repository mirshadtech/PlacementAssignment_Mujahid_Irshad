package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.ineuron.dto.Student;
import in.ineuron.util.JdbcUtil;

public class IStudentImpl implements IStudent {

	private Connection connection;
	private PreparedStatement pstmt;
	private ResultSet resultSet;

	@Override
	public List<Student> fetchAllStudentDat() {

		List<Student> stdList = null;
		try {
			connection = JdbcUtil.getConnection();
			if (connection != null) {
				String selectQuery = "SELECT sid,sname,sage,saddress FROM student;";
				pstmt = connection.prepareStatement(selectQuery);
			}

			if (pstmt != null) {
				resultSet = pstmt.executeQuery();
			}

			if (resultSet != null) {

				stdList = new ArrayList<Student>();
				while (resultSet.next()) {
					Student student = new Student();
					student.setSid(resultSet.getInt(1));
					student.setSname(resultSet.getString(2));
					student.setSage(resultSet.getInt(3));
					student.setSaddress(resultSet.getString(4));

					stdList.add(student);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return stdList;
	}

}
