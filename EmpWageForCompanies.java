package com.oops.EmpWage;

public class EmpWageForCompanies{

	public static final int IS_FULL_TIME=1; 
	public static final int IS_PART_TIME=0;
	int workingDays ; 
	int workingHrPerMonth ;
	int wagePerHr;

	EmpWageForCompanies(int wagePerHr, int workingDays, int workingHrPerMonth ){

		this.workingDays=workingDays;
		this.wagePerHr=wagePerHr;
		this.workingHrPerMonth=workingHrPerMonth;
	}

	public int companyWage(){
		int empHour = 0; 
		int empCheck,empWage;
		while (workingDays < 0 && workingHrPerMonth<0) {
			empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			if(empCheck==IS_FULL_TIME)
				empHour=8;
			else if(empCheck==IS_PART_TIME)
				empHour=4;
			else
				empHour=0;
			workingDays += 1;
			workingHrPerMonth += empHour;

		}
		empWage = workingHrPerMonth * wagePerHr;
		return empWage;

	}


	public static void main(String[] args) {
		EmpWageForCompanies dmart=new EmpWageForCompanies(30,6,150);
		EmpWageForCompanies reliance=new EmpWageForCompanies(20,6,180);
		System.out.println("Employee Wage for dmart is "+dmart.companyWage());
		System.out.println("Employee Wage for Reliance is "+reliance.companyWage());
	}
}







