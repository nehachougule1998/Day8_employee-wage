package com.bridgelabz;
import java.util.Random;
import java.util.Scanner;
public class Employeewage{
	static final int full_time= 8;
    static final int part_time= 4;
    int wagePerHrs;
    int workingDay;
    int maxworkingHrs;
    String name;
    int monthlyWage;
    
    void companyMonthlyWage(int monthlyWage) {
 	   this.monthlyWage=monthlyWage;
    }
    
    public Employeewage(String name, int wagePerHrs, int workingDay, int maxworkingHrs, int monthlyWage) {
		super();
		this.wagePerHrs = wagePerHrs;
		this.workingDay = workingDay;
		this.maxworkingHrs = maxworkingHrs;
		this.name = name;
		this.monthlyWage = monthlyWage;
	}

	public void employeeAttendance() {
		 int empHrs = 0;
         int monthlyWage = 0;
         int days = 1;
         int hours = 0;
         System.out.println("Company name : "+ name);
         while(days < workingDay && hours < maxworkingHrs) {
         	int empCheck = (int)Math.floor(Math.random() *10) % 3;
         	int remaining_Hours=100-hours;
         	if(remaining_Hours%8<1) {
         		System.out.println(" Employee is present for part time");
         		int partialDailyWage = part_time * wagePerHrs;
         		System.out.println("Daily Wage :Rs."+partialDailyWage);
         		monthlyWage=monthlyWage+partialDailyWage;
         		hours=hours+part_time;
         }
         	days ++;
         	
        switch (empCheck) {
        case 1 :
               System.out.println("Employee is Full time presnt");
               int dailyWage = full_time * wagePerHrs;
               System.out.println("Daily wage : "+dailyWage);
               monthlyWage = monthlyWage + dailyWage;
               hours = hours + full_time;
               break;
        case 2 :
               System.out.println("Employee is Part time presnt");
               int dailyWage_par = part_time * wagePerHrs;
               System.out.println("Daily wage : "+ dailyWage_par);
               monthlyWage = monthlyWage + dailyWage_par;
               hours = hours+part_time;
               break;
        default :
                System.out.println("Employee absent");
        }  
     } 
         
               System.out.println("Monthly Wage : " + monthlyWage);
               System.out.println("Total Hours  : "+hours);
               System.out.println("day  : "+ days);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		
		Employeewage employee1 = new Employeewage("google", 23, 45, 56, 78);
		employee1.employeeAttendance();
		Employeewage employee2 = new Employeewage("microsoft", 34, 89, 37, 100);
		employee2.employeeAttendance();
		
		EmpBuilder empBuilder = new EmpBuilder();
		
		empBuilder.showInfo(employee1);
		empBuilder.addCompany(employee1);
		
		empBuilder.showInfo(employee2);
		empBuilder.addCompany(employee2);
	}	
}



