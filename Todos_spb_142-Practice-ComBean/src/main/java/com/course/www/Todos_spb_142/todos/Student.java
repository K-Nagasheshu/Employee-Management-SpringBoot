package com.course.www.Todos_spb_142.todos;

public class Student {
	
	
	private String Name;
	private int Empid;
	private String Leave;
	private int Days;
	
	
	public Student() {
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		this.Empid = empid;
	}
	public String getLeave() {
		return Leave;
	}
	public void setLeave(String leave) {
		this.Leave = leave;
	}
	public int getDays() {
		return Days;
	}
	public void setDays(int days) {
		this.Days = days;
	}
	
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", empid=" + Empid + ", leave=" + Leave + ", days=" + Days + "]";
	}
}
	
	
	
	
	
	