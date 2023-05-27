package in.ineuron.persistence;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.ineuron.Question11.Util.JdbcUtil;
import in.ineuron.Question11.dto.Student;

public class StudentDaoImpl implements IStudentDao {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Student obj = null;

	@Override
	public List<Student> searchStudent() {
		@SuppressWarnings("unchecked")
		ArrayList<Student> al = new ArrayList();
		String sqlQuery = "select sid,sname,sage,sadd from students";
		try {
			con = JdbcUtil.getJdbcConnection();
			if (con != null) {
				pstmt = con.prepareStatement(sqlQuery);
			}
			if (pstmt != null) {

				rs = pstmt.executeQuery();
			}
			if (rs != null) {

				while (rs.next()) {

					obj = new Student();
					obj.setSid(rs.getInt(1));
					obj.setSname(rs.getString(2));
					obj.setSage(rs.getInt(3));
					obj.setAddress(rs.getString(4));
					al.add(obj);

				}

			}
		} catch (SQLException | IOException e) {

			e.printStackTrace();
		}

		return al;
	}

}