package com.ineuron.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement pstmt = null;
		BufferedReader br = null;
		FileReader fr = null;

		try {
			String url = "jdbc:postgresql://localhost:5432/mirshad";
			String user = "mujy";
			String password = "root";
			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) {
				String insertQuery = "insert into student (sname,sage,saddress) values(?,?,?)";
				pstmt = connection.prepareStatement(insertQuery);
			}

			if (pstmt != null) {
				fr = new FileReader("E:\\Java-Workspace\\Question13\\src\\studentData.txt");
				br = new BufferedReader(fr);
				String line = br.readLine();
				while (line != null) {
					String[] splitData = line.split(" ");

					pstmt.setString(1, splitData[0]);
					pstmt.setInt(2, Integer.parseInt(splitData[1]));
					pstmt.setString(3, splitData[2]);

					pstmt.addBatch();
					line = br.readLine();
				}
			}

			int[] rowsAffected = pstmt.executeBatch();
			System.out.println(" No of Rows Inserted " + rowsAffected.length);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			{
				try {
					br.close();
					pstmt.close();
					connection.close();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}
}
