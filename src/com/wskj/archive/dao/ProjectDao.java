package com.wskj.archive.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.wskj.archive.pojo.Project;

public class ProjectDao extends BaseDao{
	public void add(Project project){
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("INSERT INTO t_project(project_name,pro_area,pro_doc_num,pro_scope,pro_population,"
					+ "pro_head,pro_year,pro_arc_year,pro_award_year,pro_award_leavel,pro_award_org,appraise_area,appraise_head,"
					+ "appraise_doc_num,appraise_preside,appraise_award_year,appraise_award_leavel,appraise_award_org,"
					+ "subject_name,subject_host,category_id) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			int i = 1;
			pstmt.setString(i++, project.getProjectName());
			pstmt.setString(i++, project.getProArea());
			pstmt.setString(i++, project.getProDocNo());
			pstmt.setString(i++, project.getProScope());
			pstmt.setString(i++, project.getProPopulation());
			pstmt.setString(i++, project.getProHead());
			pstmt.setInt(i++, project.getProYear());
			pstmt.setInt(i++, project.getProArcYear());
			pstmt.setInt(i++, project.getProAwardYear());
			pstmt.setString(i++, project.getProAwardLeavel());
			pstmt.setString(i++, project.getProAwardOrg());
			pstmt.setString(i++, project.getAppraiseArea());
			pstmt.setString(i++, project.getAppraiseHead());
			pstmt.setString(i++, project.getAppraiseDocNum());
			pstmt.setString(i++, project.getAppraisePreside());
			pstmt.setInt(i++, project.getAppraiseAwardYear());
			pstmt.setString(i++, project.getAppraiseAwardLeavel());
			pstmt.setString(i++, project.getAppraiseAwardOrg());
			pstmt.setString(i++, project.getSubjectName());
			pstmt.setString(i++, project.getSubjectHost());
			pstmt.setInt(i++, project.getCategoryId());
			
			pstmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, null);		
		}
	}

	public List<Project> selectAll() {
		List<Project> list = new ArrayList<Project>();
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("SELECT id,project_name,pro_area,pro_doc_num,pro_head,pro_arc_year,category_id FROM t_project");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Project pro = new Project();
				pro.setId(rs.getInt("id"));
				pro.setProjectName(rs.getString("project_name"));
				pro.setProArea(rs.getString("pro_area"));
				pro.setProDocNo(rs.getString("pro_doc_num"));
				pro.setProHead(rs.getString("pro_head"));
				pro.setProArcYear(rs.getInt("pro_arc_year"));
				pro.setCategoryId(rs.getInt("category_id"));
				list.add(pro);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection(conn, pstmt, rs);
		return list;
	}

	public void delete(int id) {
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("DELETE FROM t_project WHERE id = ?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, null);
		}
	}

	public Project get(int id) {
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Project pro = new Project();
		try {
			pstmt = conn.prepareStatement("SELECT * FROM t_project where id = ?");
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				pro.setId(rs.getInt("id"));
				pro.setProjectName(rs.getString("project_name"));
				pro.setCategoryId(rs.getInt("category_id"));
				pro.setProArea(rs.getString("pro_area"));
				pro.setProDocNo(rs.getString("pro_doc_num"));
				pro.setProScope(rs.getString("pro_scope"));
				pro.setProPopulation(rs.getString("pro_population"));
				pro.setProHead(rs.getString("pro_head"));
				pro.setProYear(rs.getInt("pro_year"));
				pro.setProArcYear(rs.getInt("pro_arc_year"));
				pro.setProAwardYear(rs.getInt("pro_award_year"));
				pro.setProAwardLeavel(rs.getString("pro_award_leavel"));
				pro.setProAwardOrg(rs.getString("pro_award_org"));
				pro.setAppraiseArea(rs.getString("appraise_area"));
				pro.setAppraiseHead(rs.getString("appraise_head"));
				pro.setAppraiseDocNum(rs.getString("appraise_doc_num"));
				pro.setAppraisePreside(rs.getString("appraise_preside"));
				pro.setAppraiseAwardYear(rs.getInt("appraise_award_year"));
				pro.setAppraiseAwardLeavel(rs.getString("appraise_award_leavel"));
				pro.setAppraiseAwardOrg(rs.getString("appraise_award_org"));
				pro.setSubjectName(rs.getString("subject_name"));
				pro.setSubjectHost(rs.getString("subject_host"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		return pro;
	}

	public void update(Project pro) {
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("UPDATE t_project SET project_name = ?, pro_area = ?, pro_doc_num = ?, pro_scope = ?, "
					+ "pro_population = ?, pro_head = ?, pro_year = ?, pro_arc_year = ?, pro_award_year = ?, "
					+ "pro_award_leavel = ?, pro_award_org = ?, appraise_area = ?, appraise_head = ?, appraise_doc_num = ?, "
					+ "appraise_preside = ?, appraise_award_year = ?, appraise_award_leavel = ?, appraise_award_org = ?, "
					+ "subject_name = ?, subject_host = ?, category_id = ? WHERE id = ?");
			int i = 1;
			pstmt.setString(i++, pro.getProjectName());
			pstmt.setString(i++, pro.getProArea());
			pstmt.setString(i++, pro.getProDocNo());
			pstmt.setString(i++, pro.getProScope());
			pstmt.setString(i++, pro.getProPopulation());
			pstmt.setString(i++, pro.getProHead());
			pstmt.setInt(i++, pro.getProYear());
			pstmt.setInt(i++, pro.getProArcYear());
			pstmt.setInt(i++, pro.getProAwardYear());
			pstmt.setString(i++, pro.getProAwardLeavel());
			pstmt.setString(i++, pro.getProAwardOrg());
			pstmt.setString(i++, pro.getAppraiseArea());
			pstmt.setString(i++, pro.getAppraiseHead());
			pstmt.setString(i++, pro.getAppraiseDocNum());
			pstmt.setString(i++, pro.getAppraisePreside());
			pstmt.setInt(i++, pro.getAppraiseAwardYear());
			pstmt.setString(i++, pro.getAppraiseAwardLeavel());
			pstmt.setString(i++, pro.getAppraiseAwardOrg());
			pstmt.setString(i++, pro.getSubjectName());
			pstmt.setString(i++, pro.getSubjectHost());
			pstmt.setInt(i++, pro.getCategoryId());
			pstmt.setInt(i++, pro.getId());
			
			pstmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, null);
		}
	}

	public List<Project> findByParams(Map<String, Object> params) {
		List<Project> list = new ArrayList<Project>();
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM t_project WHERE 1 = 1";
		if (params.get("projectName") != null) {
			sql += " and project_name like ?";
		}
		if (params.get("proHead") != null) {
			sql += " and pro_head like ?";
		}
		try {
			pstmt = conn.prepareStatement(sql);
			int i = 1;
			if (params.get("projectName") != null) {
				pstmt.setString(i++, "%" + params.get("projectName").toString() + "%");
			}
			if (params.get("proHead") != null) {
				pstmt.setString(i++, "%" + params.get("proHead").toString() + "%");
			}
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Project pro = new Project();
				pro.setId(rs.getInt("id"));
				pro.setProjectName(rs.getString("projectName"));
				pro.setProHead(rs.getString("proHead"));
				list.add(pro);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {			
			closeConnection(conn, pstmt, rs);
		}		
		return list;
	}
	
	public List<Project> findPageByParams(Map<String, Object> params, int page, int pageSize) {
		List<Project> list = new ArrayList<Project>();
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM t_project WHERE 1 = 1";
		if (params.get("projectName") != null) {
			sql += " and project_name like ?";
		}
		if (params.get("proHead") != null) {
			sql += " and pro_head like ?";
		}
		if (!params.get("categoryId").equals("0")) {	//如果项目分类不等于0，说明被选中来检索
			sql += " and category_id = ?";
		}
		sql += " limit ?,?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			int i = 1;
			if (params.get("projectName") != null) {
				pstmt.setString(i++, "%" + params.get("projectName").toString().trim() + "%");
			}
			if (params.get("proHead") != null) {
				pstmt.setString(i++, "%" + params.get("proHead").toString().trim() + "%");
			}
			if (!params.get("categoryId").equals("0")) {
				pstmt.setInt(i++, Integer.valueOf((String) params.get("categoryId")));
			}
			pstmt.setInt(i++, (page - 1)*pageSize);
			pstmt.setInt(i++, pageSize);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Project pro = new Project();
				pro.setId(rs.getInt("id"));
				pro.setProjectName(rs.getString("project_name"));
				pro.setCategoryId(rs.getInt("category_id"));
				pro.setProArea(rs.getString("pro_area"));
				pro.setProDocNo(rs.getString("pro_doc_num"));
				pro.setProScope(rs.getString("pro_scope"));
				pro.setProPopulation(rs.getString("pro_population"));
				pro.setProHead(rs.getString("pro_head"));
				pro.setProYear(rs.getInt("pro_year"));
				pro.setProArcYear(rs.getInt("pro_arc_year"));
				pro.setProAwardYear(rs.getInt("pro_award_year"));
				pro.setProAwardLeavel(rs.getString("pro_award_leavel"));
				pro.setProAwardOrg(rs.getString("pro_award_org"));
				pro.setAppraiseArea(rs.getString("appraise_area"));
				pro.setAppraiseHead(rs.getString("appraise_head"));
				pro.setAppraiseDocNum(rs.getString("appraise_doc_num"));
				pro.setAppraisePreside(rs.getString("appraise_preside"));
				pro.setAppraiseAwardYear(rs.getInt("appraise_award_year"));
				pro.setAppraiseAwardLeavel(rs.getString("appraise_award_leavel"));
				pro.setAppraiseAwardOrg(rs.getString("appraise_award_org"));
				pro.setSubjectName(rs.getString("subject_name"));
				pro.setSubjectHost(rs.getString("subject_host"));
				
				
				
				list.add(pro);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		return list;
	}

	public long findCountByParams(Map<String, Object> params) {
		Connection conn = openConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT COUNT(id) FROM t_project WHERE 1=1";
		if (params.get("projectName") != null) {
			sql += " and project_name like ?";
		}
		if (params.get("proHead") != null) {
			sql += " and pro_head like ?";
		}
		if (!params.get("categoryId").equals("0")) {	//如果项目分类不等于0，说明被选中来检索
			sql += " and category_id = ?";
		}
		try {
			pstmt = conn.prepareStatement(sql);
			int i = 1;
			if (params.get("projectName") != null) {
				pstmt.setString(i++, "%" + params.get("projectName").toString().trim() + "%");
			}
			if (params.get("proHead") != null) {
				pstmt.setString(i++, "%" + params.get("proHead").toString().trim() + "%");
			}
			if (!params.get("categoryId").equals("0")) {
				pstmt.setInt(i++, Integer.valueOf((String) params.get("categoryId")));
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
	
}
