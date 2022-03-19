package com.bridgelabz;

import java.util.ArrayList;

interface CompanyCollection {
	
	void showInfo(CompanyEmpWage company);
	void addCompany(CompanyEmpWage company);
}

public class EmpWageBuilder implements CompanyCollection {
	
	 static ArrayList<CompanyEmpWage> companyList = new ArrayList<CompanyEmpWage>();
	 
	 public void showInfo(CompanyEmpWage company) {
		 System.out.println("Company name: "+company.name);
		 System.out.println("Total Wage :"+company.monthlyWage);
	 }
	 
	 public void addCompany(CompanyEmpWage company) {
		 companyList.add(company);

	 }

}