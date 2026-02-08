package com.course.www.Todos_spb_140.todos;

public class Student {
	
	private int serialNo;
	private int HallTicketNo;
	private String name;
	private String standard;
	
	
	
	public Student(int serialNo, int hallTicketNo, String name, String standard) {
		super();
		this.serialNo = serialNo;
		HallTicketNo = hallTicketNo;
		this.name = name;
		this.standard = standard;
	}
	
	
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public int getHallTicketNo() {
		return HallTicketNo;
	}
	public void setHallTicketNo(int hallTicketNo) {
		HallTicketNo = hallTicketNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}


	@Override
	public String toString() {
		return "Student [serialNo=" + serialNo + ", HallTicketNo=" + HallTicketNo + ", name=" + name + ", standard="
				+ standard + "]";
	}
	
	
	
	
}
	
