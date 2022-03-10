package com.bridgelabz;

public class Employeewage {

	public static void main(String[] args) {
		System.out.println("welcome to employee wage computation program");

	    int present = 0;
        int absent = 1;
        int check=(int)Math.floor(Math.random() *10) % 2;

        if (check==present) {
            System.out.println("Employee is present."); //if check=0 than employee present
       }
        else
        {
            System.out.println("Employee is absent."); //if check=1 than employee absent
       }
	    
    }
	
}
