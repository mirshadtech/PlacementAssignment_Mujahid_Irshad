package com.ineuron.persistance;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ineuron.dto.Student;
import com.ineuron.util.JdbcUtil;

public class StudentDaoImpl implements IStudentDao {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Student obj = null;

	@Override
	public String addStudent(String sname, Integer sage, String saddress) {
		String sqlQuery = "insert into students(`sname`,`sage`,`sadd`) VALUES(?,?,?)";
		try {
			con = JdbcUtil.getJdbcConnection();
			if (con != null) {
				pstmt = con.prepareStatement(sqlQuery);
			}
			if (pstmt != null) {
				pstmt.setString(1, sname);
				pstmt.setInt(2, sage);
				pstmt.setString(3, saddress);

				int rowaffcted = pstmt.executeUpdate();
				if (rowaffcted == 1) {
					return "success";
				}

			}
		} catch (SQLException | IOException e) {

			e.printStackTrace();
		}

		return "faliure";
	}

	@Override
	public Student searchStudent(Integer sid) {
		String sqlQuery = "select sid,sname,sage,sadd from students where sid=?";
		try {
			con = JdbcUtil.getJdbcConnection();
			if (con != null) {
				pstmt = con.prepareStatement(sqlQuery);
			}
			if (pstmt != null) {
				pstmt.setInt(1, sid);
				rs = pstmt.executeQuery();
			}
			if (rs != null) {
				if (rs.next()) {
					obj = new Student();
					obj.setSid(rs.getInt(1));
					obj.setSname(rs.getString(2));
					obj.setSage(rs.getInt(3));
					obj.setAddress(rs.getString(4));
					return obj;
				}

			}
		} catch (SQLException | IOException e) {

			e.printStackTrace();
		}

		return obj;
	}

	@Override
	public String updateStudent(Student student) {
		String status = null;
		int rowAffected = 0;
		try {
			con = JdbcUtil.getJdbcConnection();

			if (con != null) {
				String insertQuery = "update students set sname=?,sage=?,sadd=? where sid=?";
				pstmt = con.prepareStatement(insertQuery);
			}

			if (pstmt != null) {
				pstmt.setString(1, student.getSname());
				pstmt.setInt(2, student.getSage());
				pstmt.setString(3, student.getAddress());
				pstmt.setInt(4, student.getSid());
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
	public String deleteStudent(Integer sid) {
		String deleteQuery = "delete from students where sid=?";
		try {
			con = JdbcUtil.getJdbcConnection();

			if (con != null) {
				pstmt = con.prepareStatement(deleteQuery);
			}
			if (pstmt != null) {
				pstmt.setInt(1, sid);
				int rowaffctd = pstmt.executeUpdate();

				if (rowaffctd > 0) {
					return "Success";
				}
			}
		} catch (SQLException | IOException e) {

			e.printStackTrace();
		}
		return "Faliure";
	}

}
