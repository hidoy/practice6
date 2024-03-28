package com.javaex.ex05;

public class Depart extends Employee{
	private String department;
	public Depart(String name,int salary,String department) {
		super(name,salary);
		this.department=department;
	}
	public String setDepartment() {
		return department;
	}
	public void getDepartment(String department) {
		this.department=department;
	}
	@Override
	public void showInformation() {
		System.out.printf("이름:%s 연봉:%d, 부서:%s",super.getName(),super.getSalary(),department);
	}

}
