package com.wskj.archive.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.wskj.archive.pojo.User;

public class UserDao extends BaseDao {
	public void add(User user) {
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("INSERT INTO t_user(username, PASSWORD, phone, email) VALUES (?, ?, ?, ?)");
			int i = 1;
			pstmt.setString(i++, user.getUsername());
			pstmt.setString(i++, user.getPassword());
			pstmt.setString(i++, user.getPhone());
			pstmt.setString(i++, user.getEmail());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, null);
		}		
	}

//	public List<User> selectAllUser() {
//		List<User> list = new ArrayList<User>();
//		Connection conn = openConnection();
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		try {
//			pstmt = conn.prepareStatement("SELECT id,username,phone,email FROM t_user");
//			rs = pstmt.executeQuery();
//			while (rs.next()) {
//				User user = new User();
//				user.setId(rs.getInt("id"));
//				user.setUsername(rs.getString("username"));
//				user.setPhone(rs.getString("phone"));
//				user.setEmail(rs.getString("email"));
//				list.add(user);
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		closeConnection(conn, pstmt, rs);
//		return list;
//	}

	public void dedeleteuser(int id) {
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("DELETE FROM t_user WHERE id = ?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, null);
		}
	}

	public User get(int id) {
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = new User();
		try {
			pstmt = conn.prepareStatement("select * FROM t_user WHERE id = ?");
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setPhone(rs.getString("phone"));
				user.setEmail(rs.getString("email"));
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		return user;
	}
	
	public void updateUserInfo(User user) {
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("UPDATE t_user SET username = ?, phone = ?, email = ? WHERE id = ?");
			int i = 1;
			pstmt.setString(i++, user.getUsername());
			pstmt.setString(i++, user.getPhone());
			pstmt.setString(i++, user.getEmail());
			pstmt.setInt(i++, user.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, null);
		}
	}

	public boolean matchUser(String username, String password) {
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("SELECT * FROM t_user WHERE username = ? and password = ?");
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		return false;
	}

	public String getPW(String username) {
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String password = null;
		try {
			pstmt = conn.prepareStatement("SELECT password FROM t_user WHERE username = ?");
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				password = rs.getString("password");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		return password;		
	}

	public void updatePassword(User user) {
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("UPDATE t_user SET password = ? WHERE username = ?");
			int i = 1;
			pstmt.setString(i++, user.getPassword());
			pstmt.setString(i++, user.getUsername());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, null);
		}
	}

//	public String getPasswordById(int id) {
//		Connection conn = openConnection();
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		String password = null;
//		try {
//			pstmt = conn.prepareStatement("SELECT PASSWORD FROM t_user WHERE id = ?");
//			pstmt.setInt(1, id);
//			rs = pstmt.executeQuery();
//			if (rs.next()) {
//				password = rs.getString("password");
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			closeConnection(conn, pstmt, rs);
//		}
//		return password;
//	}

	public void resetPassword(User user) {
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("UPDATE t_user SET password = ? WHERE id = ?");
			int i = 1;
			pstmt.setString(i++, user.getPassword());
			pstmt.setInt(i++, user.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, null);		
		}
	}

	public List<User> searchUser(Map<String, Object> list) {
		List<User> resultList = new ArrayList<User>();
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT id,username,phone,email FROM t_user where 1 = 1";
			if (list.get("username") != null) {
				sql += " and username like ?";
			}
			if (list.get("phone") != null) {
				sql += " and phone like ?";
			}			
			pstmt = conn.prepareStatement(sql);
			int i = 1;
			if (list.get("username") != null) {
				pstmt.setString(i++, "%" + list.get("username").toString() + "%");
			}
			if (list.get("phone") != null) {
				pstmt.setString(i++, "%" + list.get("phone").toString() + "%");
			}	
			rs = pstmt.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPhone(rs.getString("phone"));
				user.setEmail(rs.getString("email"));
				resultList.add(user);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		return resultList;
	}

	public long showTotalCount(Map<String, Object> list) {
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT COUNT(id) FROM t_user WHERE 1 = 1";
			if (list.get("username") != null) {
				sql += " and username like ?";
			}
			if (list.get("phone") != null) {
				sql += " and phone like ?";
			}	
			pstmt = conn.prepareStatement(sql);
			int i = 1;
			if (list.get("username") != null) {
				pstmt.setString(i++, "%" + list.get("username").toString().trim() + "%");
			}
			if (list.get("phone") != null) {
				pstmt.setString(i++, "%" + list.get("phone").toString().trim() + "%");
			}
			rs = pstmt.executeQuery();
			rs.next();
			return rs.getLong(1);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		return -1;
	}

	public List<User> showPage(Map<String, Object> list, int page, int pageSize) {
		List<User> pagelist = new ArrayList<User>();
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT id,username,phone,email FROM t_user where 1 = 1";
			if (list.get("username") != null) {
				sql += " and username like ?";
			}
			if (list.get("phone") != null) {
				sql += " and phone like ?";
			}
			sql += " limit ?,?";
			pstmt = conn.prepareStatement(sql);
			int i = 1;
			if (list.get("username") != null) {
				pstmt.setString(i++, "%" + list.get("username").toString().trim() + "%");
			}
			if (list.get("phone") != null) {
				pstmt.setString(i++, "%" + list.get("phone").toString().trim() + "%");
			}
			pstmt.setInt(i++, (page-1)*pageSize);
			pstmt.setInt(i++, pageSize);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPhone(rs.getString("phone"));
				user.setEmail(rs.getString("email"));
				pagelist.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		return pagelist;
	}

	public boolean userExisted(String username) {
		boolean canCreate = false;
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("SELECT username FROM t_user where username = ?");
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
			if (rs.next() == false) {
				canCreate = true;
				return canCreate;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}		
		return canCreate;
	}
	
}
