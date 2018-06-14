package com.wskj.archive.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wskj.archive.dao.UserDao;
import com.wskj.archive.pojo.User;
import com.wskj.archive.util.PageInfo;

public class UserService {
	public void add(User user) {
		UserDao ud = new UserDao();
		ud.add(user);
	}

//	public List<User> selectAllUser() {
//		UserDao ud = new UserDao();
//		return ud.selectAllUser();
//	}

	public void deleteuser(int id) {
		UserDao ud = new UserDao();
		ud.dedeleteuser(id);
	}

	public User get(int id) {
		UserDao ud = new UserDao();
		return ud.get(id);
	}
	
	public void updateUserInfo(User user) {
		UserDao ud = new UserDao();
		ud.updateUserInfo(user);
	}

	public boolean matchUser(String username, String password) {
		UserDao ud = new UserDao();
		return ud.matchUser(username,password);
	}

	public String getPW(String username) {
		UserDao ud = new UserDao();
		return ud.getPW(username);
	}

	public void updatePassword(User user) {
		UserDao ud = new UserDao();
		ud.updatePassword(user);
	}

//	public String getPasswordById(int id) {
//		UserDao ud = new UserDao();
//		return ud.getPasswordById(id);
//	}

	public void resetPassword(User user) {
		UserDao ud = new UserDao();
		ud.resetPassword(user);
	}

	public List<User> searchUser(String username, String phone) {
		Map<String, Object> list = new HashMap<String, Object>();
		if (username != null && username.trim().length() > 0) {
			list.put("username", username);
		}
		if (phone != null && phone.trim().length() > 0) {
			list.put("phone", phone);
		}
		
		UserDao ud = new UserDao();
		return ud.searchUser(list);
	}

	public PageInfo<User> showPage(String username, String phone, int page, int pageSize) {
		if (page < 1) {
			page = 1;
		}
		if (pageSize < 1) {
			pageSize = 3;
		}
		Map<String, Object> list = new HashMap<String, Object>();
		if (username != null && username.trim().length() > 0) {
			list.put("username", username);
		}
		if (phone != null && phone.trim().length() > 0) {
			list.put("phone", phone);
		}
		PageInfo<User> pi = new PageInfo<User>();
		UserDao ud = new UserDao();
		
		long totalSize = ud.showTotalCount(list);
		List<User> users = ud.showPage(list, page, pageSize);
		pi.setResult(users);
		pi.setCurrentPage(page);
		pi.setPageSize(pageSize);
		pi.setTotalSize((int)totalSize);
		return pi;
	}

	public boolean userExisted(String username) {
		UserDao ud = new UserDao();
		return ud.userExisted(username);
	}
	
}
