package com.wskj.archive.dao;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class BaseDao {

	public static ComboPooledDataSource c3p0 = null;

	public Connection openConnection() {
		if (c3p0 == null) {

			c3p0 = new ComboPooledDataSource();
			try {
				c3p0.setDriverClass("com.mysql.jdbc.Driver");
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
			c3p0.setJdbcUrl("jdbc:mysql://localhost:3306/archive?useUnicode=true&characterEncoding=utf8");
			c3p0.setUser("root");
			c3p0.setPassword("123456");

			c3p0.setMinPoolSize(1);
			c3p0.setAcquireIncrement(2);
			c3p0.setMaxPoolSize(5);
		}
		Connection conn = null;
		try {
			conn = c3p0.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void closeConnection(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null && !rs.isClosed()) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (pstmt != null && !pstmt.isClosed()) {
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
