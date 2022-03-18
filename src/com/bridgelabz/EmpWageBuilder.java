package com.bridgelabz;
import java.util.ArrayList;
public class EmpWageBuilder {

private ArrayList<Employeewage> companyList = new ArrayList<Employeewage>();
	 
	 void showinfo(Employeewage EmployeeWage) {
		 System.out.println("Company name: "+EmployeeWage.name);
		 System.out.println("Total Wage :"+EmployeeWage.monthlyWage);
	 }
	 
	 void addCompany(Employeewage EmployeeWage) {
		 companyList.add(EmployeeWage);
	 }

}
