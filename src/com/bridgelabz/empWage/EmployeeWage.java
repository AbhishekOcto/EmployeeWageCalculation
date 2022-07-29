package com.bridgelabz.empWage;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Calculation Program");
		
		//added UC5
		
		int WagePerHour=20;
		int FullDayHour=8;
		int PartTimeHour=4;
		int WorkingDays=20;
		
		for  (int day = 0; day <= WorkingDays; day++) {
		int isPresent =(int) Math.floor(Math.random()*10) % 3;
		switch (isPresent) {
		
		case 0: 
			System.out.println("Employee is Absent");
			System.out.println("Employee Wage for a month is 0 ");
			break;
		case 1:
			System.out.println("Employee is Present and Full time");
			System.out.println("Employee's Wage for a month is " +WagePerHour*FullDayHour*WorkingDays);
			break;
		case 2:
			System.out.println("Employee is Present and doing part time");
			System.out.println("Employee's part time Wage for a month is :" +WagePerHour*PartTimeHour*WorkingDays);
			break;
		    }
     	 }
  
	}
}
