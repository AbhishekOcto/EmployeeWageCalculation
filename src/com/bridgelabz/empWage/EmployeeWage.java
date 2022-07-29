package com.bridgelabz.empWage;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Calculation Program");
		
		//UC2
		
		int EmployeePresent=1;
		int WagePerHour=20;
		int FullDayHour=8;
		int isPresent =(int) Math.floor(Math.random()*10) % 2;
		if (isPresent == EmployeePresent) {
			System.out.println("Employee is Present");
			System.out.println("Employee wage for a day is " +WagePerHour*FullDayHour);
		}
		else {
			System.out.println("Employee is Absent");
			System.out.println("Employee wage for a day is 0");
		}
	}

}
