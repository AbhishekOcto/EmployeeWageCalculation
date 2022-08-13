package com.bridgelabz.empWage;

public class EmployeeWage {
	/* 
	 * UC8
	 * Compute Employee Wage for multiple companies
	 * */
	
	public static final int EmployeePresent = 1;
	public static final int EmployeePartTime = 2;
	private final  String companyName;
	private final  int WagePerHour;
	private final  int WorkingDays;
	private final  int MonthMaxHours;
	
		int numberOfHours = 0;
		int nHours = 0;
		int totalWorkingDays = 0; 
		int totalWorkingHours = 0;
		int totalEmployeeWage = 0;
		
		public EmployeeWage(String companyName, int WagePerHour, int WorkingDays, int MonthMaxHours) {
			this.companyName = companyName;
			this.WagePerHour = WagePerHour;
			this.WorkingDays = WorkingDays;
			this.MonthMaxHours = MonthMaxHours;
				
		}
		
		public int wageCalculation() {	
			
			while( totalWorkingHours <= MonthMaxHours && totalWorkingDays < WorkingDays ) {
				
				totalWorkingDays++;
				
				int isPresent = (int)Math.floor(Math.random()*10)%3;
				
				switch(isPresent) {
				
				case EmployeePartTime:
					numberOfHours = 4;
					break;
				case EmployeePresent:
					numberOfHours = 8;
					break;
				default:
					numberOfHours = 0;
					}
				
				totalWorkingHours += numberOfHours;
				
				System.out.println("Day : "+ totalWorkingDays + "; Employee hours for the day : " +numberOfHours);	
				
			}
		   
		return totalWorkingHours * WagePerHour;
		
		}
		
	
     public static void main(String[] args) {
    	 System.out.println("Welcome to Employee Wage Calculation Program");
	  
    	 EmployeeWage dMart = new EmployeeWage("dMart", 20, 20, 150);
    	 EmployeeWage Reliance = new EmployeeWage("Reliance", 25, 18, 150);
    	 EmployeeWage Flipkart = new EmployeeWage("Flipkart", 28, 24, 172);
    	 EmployeeWage Amazon = new EmployeeWage("Amazon ", 22, 22, 158);
    	 EmployeeWage Google = new EmployeeWage("Google ", 30, 26, 160);
    	 
 		System.out.println("Total EmpWage for Company " + dMart.companyName + " is : " +dMart.wageCalculation());
 		System.out.println("Total EmpWage for Company " + Reliance.companyName + " is : " + Reliance.wageCalculation());
 		System.out.println("Total EmpWage for Company " + Flipkart.companyName + " is : " + Flipkart.wageCalculation());
 		System.out.println("Total EmpWage for Company " + Amazon.companyName + " is : " + Amazon.wageCalculation());
 		System.out.println("Total EmpWage for Company " + Google.companyName + " is : " + Google.wageCalculation());
 		
	    }
     
 }