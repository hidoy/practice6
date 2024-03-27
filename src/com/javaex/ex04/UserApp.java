package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		User u1[]=new User[3]; 
		u1[0]= new Customer("jws","j1234","정우성",1000);
		u1[1]= new Customer("yjs","y2345","이효리",2000);
		u1[2]= new Employee("master","m7788","운영자",500);
		
		for(int i=0;i<3;i++) {
			u1[i].showInfo();
		}
		System.out.printf("운영자의 월급은 %d",5000000);
	}

}
