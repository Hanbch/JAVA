package edu.hi.ex02.dto;

public class DeptDto {
	private String dname;
	private int deptno;
	private String Loc;
	
	public DeptDto() {}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getDeptno() {
		return deptno;
	}

	public DeptDto(String dname, int deptno, String loc) {
		
		this.dname = dname;
		this.deptno = deptno;
		Loc = loc;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getLoc() {
		return Loc;
	}

	public void setLoc(String loc) {
		Loc = loc;
	}
	
	
	
}
