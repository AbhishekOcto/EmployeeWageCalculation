package com.bridgelabz.empWage;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Calculation Program");
		
		//UC2
		
		int EmployeePresent=1;
		int EmployeePartTime=2;
		int WagePerHour=20;
		int FullDayHour=8;
		int PartTimeHour=4;
		
		int isPresent =(int) Math.floor(Math.random()*10) % 3;
		if (isPresent == EmployeePresent) {
			System.out.println("Employee is Present");
			System.out.println("Employee wage for a day is : " +WagePerHour*FullDayHour);
		}
		else if(isPresent == EmployeePartTime) {
			System.out.println("Employee is doing part time");
			System.out.println("Employee part time wage for a day is " +WagePerHour*PartTimeHour);
		}
		else  {
			System.out.println("Employee is Absent");
			System.out.println("Employee wage for a day is 0");
		}
	}

}
