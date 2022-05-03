package com.grade.entity;

public abstract class Student {
	private String studentNo;
	private String studentName;
	private int[] gradeArr;
	public Student(String studentNo, String studentName, int[] gradeArr) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.gradeArr = gradeArr;
	}
	public String getStudentNo(){
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int[] getGradeArr() {
		return gradeArr;
	}
	public void setGradeArr(int[] gradeArr) {
		this.gradeArr = gradeArr;
	}
	public int getTotal() {
		return 0;
	}
	public double getAverage() {
		return 0;
	}
	public abstract boolean isPass();
	
	public String toString() {
		
	}
	

}
