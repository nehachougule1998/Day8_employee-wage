package com.bridgelabz;

import java.util.ArrayList;

public class EmpWageBuilder {
	
 static ArrayList<CompanyEmpWage> companyList = new ArrayList<CompanyEmpWage>();
	 
	 void showInfo(CompanyEmpWage company) {
		 System.out.println("Company name: "+company.name);
		 System.out.println("Total Wage :"+company.monthlyWage);
	 }
	 
	 void addCompany(CompanyEmpWage company) {
		 companyList.add(company);

	 }
}