package com.bridgelabz;
import java.util.Random;
import java.util.Scanner;
public class Employeewage{
	 static final int full_time = 1;
	 static final int part_time = 2;
	 public static void employeeAttendance(String name, int wagePerHrs, int workingDay, int maxworkingHrs){
	
		     int wage_per_hrs = 20;
	         int full_day_hrs = 8;
	         int part_time_hrs = 4;
	         int working_days =20;
	         int montlyl_Wage = 0;
	         int wage;
	         int montly_Wage=0;
	         int hours=0;
	         int days=1;
	         
	        
	         System.out.println("Company name : "+ name);
	         int check=(int)Math.floor(Math.random() *10) % 3;
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
	         System.out.println(" total wage for a Month : " + montly_Wage);
	         System.out.println("Total working Hours  : "+hours);
	         System.out.println(" total working days  : "+ days);
	         }
	         public static void main(String[] args) {
	    		System.out.println("Welcome to Employee Wage Computation");
	    		Employeewage.employeeAttendance("google", 23, 56, 78);
	    		Employeewage.employeeAttendance("microsoft", 39, 28, 64);
	    	}

	  }
	    