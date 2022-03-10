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
         int wage;
         int check=(int)Math.floor(Math.random() *10) % 3;
         
         switch (check) {
         case full_time : 
             System.out.println("Employee is full time present"); 
             wage = full_day_hrs * wage_per_hrs;
             System.out.println("emp wage : " +wage);
             break;
        
         case part_time : 
             System.out.println("Employee is part time present"); 
             wage = part_time_hrs * wage_per_hrs;
             System.out.println("emp wage : " +wage);
             break;
	                 
         default:
        	 System.out.println("employee is absent");
          }
        
        }
    }

