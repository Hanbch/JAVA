package edu.hi.ex02.dto;

public class Dto {
	public String dname,loc;
	public int deptno;
	
	public Dto() {}
	
	public Dto(String dname, String loc, int deptno) {
		this.dname = dname;
		this.loc = loc;
		this.deptno = deptno;
	}
	
	public String getDname() {
		return dname;
	}
	
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	public String getLoc() {
		return loc;
	}
	
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public int getDeptno() {
		return deptno;
	}
	
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	
}
