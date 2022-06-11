package com.prac.db.dto;

public class empDto {
 
	private String ename;
	private int deptno;
	private String job;
	
	public empDto() {}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public empDto(String ename, int deptno, String job) {
		
		this.ename = ename;
		this.deptno = deptno;
		this.job = job;
	}
	
	
	
}
