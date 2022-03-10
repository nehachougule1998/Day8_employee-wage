package com.bridgelabz;
import java.util.Random;
import java.util.Scanner;
public class Employeewage{
	 static final int full_time = 1;
	 static final int part_time = 2;
	    public static void employeeAttendance(){
	
		     int wage_per_hrs = 20;
	         int full_day_hrs = 8;
	         int part_time_hrs = 4;
	         int working_days =20;
	         int montlyl_Wage = 0;
	         int wage;
	         int montly_Wage=0;
	         int hours=0;
	         int days=1;
	         
	        
			while(days<20 && hours<100) {
	     		days++;
	         int check=(int)Math.floor(Math.random() *10) % 3;
	         int remaining_Hours=100-hours;
	         if(remaining_Hours%8<1) {
	        	 System.out.println("Employee is part time present"); 
	             wage = part_time_hrs * wage_per_hrs;
	             System.out.println("emp wage : " +wage);
	             montly_Wage  = montly_Wage + wage;
	             hours = hours + part_time_hrs;
	        	 
	         }
	         switch (check) {
	         case full_time : 
	             System.out.println("Employee is full time present"); 
	             wage = full_day_hrs * wage_per_hrs;
	             System.out.println("emp wage : " +wage);
	             montly_Wage  = montly_Wage + wage;
	             hours = hours + full_day_hrs;
	        	 break;
	        
	         case part_time : 
	             System.out.println("Employee is part time present"); 
	             wage = part_time_hrs * wage_per_hrs;
	             System.out.println("emp wage : " +wage);
	             montly_Wage  = montly_Wage + wage;
	             hours = hours + part_time_hrs;
	        	 break;
		                 
	         default:
	        	 System.out.println("employee is absent");
	          }
	            
	        }
	         System.out.println("Total wage for a month is " + montly_Wage);
	         System.out.println("Total working hours : "+ hours);
	     	 System.out.println("total working days : "+ days);
	    }
	    public static void main(String[] args) {
			 System.out.println("Welcome to employee_wage computation");
			 Employeewage.employeeAttendance();
	}
}
		

