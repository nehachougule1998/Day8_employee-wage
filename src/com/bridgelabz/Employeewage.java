package com.bridgelabz;
import java.util.Random;
import java.util.Scanner;
public class Employeewage{
	 static final int full_time = 1;
	    static final int part_time =2;
	   public static void main(String[] args) {
			 System.out.println("Welcome to employee_wage computation");
		     int wage_per_hrs = 20;
	         int full_day_hrs = 8;
	         int part_time_hrs = 4;
	         int working_days =20;
	         int montly_Wage = 0;
	         int wage = 0;
	         
	         for (int day = 1; day <= working_days; day++) {
	         int check=(int)Math.floor(Math.random() *10) % 3;
	         
	         switch (check) {
	         case full_time : 
	             System.out.println("Employee is full time present"); 
	             montly_Wage = full_day_hrs * wage_per_hrs;
	             System.out.println("emp wage : " +wage);
	             montly_Wage  = montly_Wage + wage;
	             break;
	        
	         case part_time : 
	             System.out.println("Employee is part time present"); 
	             wage = part_time_hrs * wage_per_hrs;
	             System.out.println("emp wage : " +wage);
	             montly_Wage  = montly_Wage + wage;
	             break;
		                 
	         default:
	        	 System.out.println("employee is absent");
	          }
	            
	        }
	         System.out.println("Total wage for a month is " + montly_Wage);
	    }
	}

		


