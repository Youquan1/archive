package com.wskj.archive.util;

import java.util.ArrayList;
import java.util.List;

public class PageInfo<T> {

	private List<T> result = new ArrayList<T>(); 
	private long totalSize; 	//数据总条数
//	private int totalPageSize; 		//总页数
	private int pageSize;		//每页显示的数据数量
	private int currentPage;	//当前页数

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}

	public long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(long totalSize) {
		this.totalSize = totalSize;
	}

	public int getTotalPageSize() {
		int size = 0;
		if(totalSize % pageSize == 0){
			size = (int) (totalSize / pageSize);
		} else {
			size = (int) (totalSize / pageSize) + 1;
		}
		return size;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

}
