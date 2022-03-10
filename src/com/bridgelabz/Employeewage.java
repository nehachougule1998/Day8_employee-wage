package com.bridgelabz;

public class Employeewage {

	public static void main(String[] args) {
		System.out.println("welcome to employee wage computation program");

		 int full_time = 1;
         int part_time = 2;
         int wage_per_hrs = 20;
         int full_day_hrs = 8;
         int part_time_hrs = 4;
         int wage;
         int check=(int)Math.floor(Math.random() *10) % 3;
         
         if (check==full_time) {
             System.out.println("Employee is full time present"); 
             wage = full_day_hrs * wage_per_hrs;
             System.out.println("emp wage : " +wage);
        }
         else if (check==part_time) 
	    {
             System.out.println("Employee is part time present"); 
             wage = part_time_hrs * wage_per_hrs;
             System.out.println("emp wage : " +wage);
             
        } 
         else 
         {	 
        	System.out.println("employee is absent");
        }
         
	    
     }
}	
