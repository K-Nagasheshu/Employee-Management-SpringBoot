package com.course.www.Todos_spb_141.todos;

public class Student {
	
	private int RollNumber;
	private String Name;
	private String Standard;
	private int Marks;
	
	public Student(int rollNumber, String name, String standard, int marks) {
		super();
		RollNumber = rollNumber;
		Name = name;
		Standard = standard;
		Marks = marks;
	}

	public int getRollNumber() {
		return RollNumber;
	}
	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getStandard() {
		return Standard;
	}
	public void setStandard(String standard) {
		Standard = standard;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}

	@Override
	public String toString() {
		return "Student [RollNumber=" + RollNumber + ", Name=" + Name + ", Standard=" + Standard + ", Marks=" + Marks
				+ "]";
	}
}
	
	
	