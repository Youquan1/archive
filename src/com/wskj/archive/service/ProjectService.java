package com.wskj.archive.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wskj.archive.dao.ProjectDao;
import com.wskj.archive.pojo.Project;
import com.wskj.archive.util.PageInfo;

public class ProjectService {
	public void add(Project project){
		ProjectDao pd = new ProjectDao();
		pd.add(project);
	}

	public List<Project> selectAll() {
		ProjectDao pd = new ProjectDao();
		return pd.selectAll();
	}
	
	public void delete(int id){
		ProjectDao pd = new ProjectDao();
		pd.delete(id); 
	}

	public Project get(int id) {
		ProjectDao pd = new ProjectDao();
		return pd.get(id);
	}

	public void update(Project pro) {
		ProjectDao pd = new ProjectDao();
		pd.update(pro);
	}

	public List<Project> findByParams(String projectName, String proHead) {
		Map<String, Object> params = new HashMap<String, Object>();
		if (projectName != null && projectName.trim().length() > 0) {
			params.put("projectName", projectName);
		}
		if (proHead != null && proHead.trim().length() > 0) {
			params.put("proHead", proHead);
		}
		ProjectDao pd = new ProjectDao();
		return pd.findByParams(params);		
	}
	
	public PageInfo<Project> findPageByParams(String projectName, String proHead, String categoryId, int page, int pageSize) {
		if (page < 1) {
			page = 1;
		}
		if (pageSize < 1) {
			pageSize = 3;
		}
		
		Map<String, Object> params = new HashMap<String, Object>();
		if (projectName != null && projectName.trim().length() > 0) {
			params.put("projectName", projectName);
		}
		if (proHead != null && proHead.trim().length() > 0) {
			params.put("proHead", proHead);
		}
		params.put("categoryId", categoryId);
		
		PageInfo<Project> pi = new PageInfo<Project>();
		ProjectDao pd = new ProjectDao();
		long totalSize = pd.findCountByParams(params);		//总条数
		List<Project> pro = pd.findPageByParams(params,page,pageSize);		//显示数据
		pi.setResult(pro);
		pi.setCurrentPage(page);
		pi.setTotalSize((int)totalSize);
		pi.setPageSize(pageSize);
		return pi;
	}
	
	
	
}
