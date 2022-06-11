package edu.hi.ex.dto;

public class deptDto {
	private String dname;
	private int deptno;
	private String loc;
	
	public deptDto() {}
	
	public deptDto(String dname, int deptno, String loc) {
		
		this.dname = dname;
		this.deptno = deptno;
		this.loc = loc;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}
