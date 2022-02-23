package com.blz.practiceusingoops;

import java.util.Random;

class Employe {
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;
	static final int EMP_WAGE_PER_DAY = 20;
	static final int EMP_WAGE_FOR_MONTH = 20;

	public static int empCheck() {
		Random random = new Random();
		int empCheck = random.nextInt(3);
		return empCheck;
	}

	public static int empSalary(int empCheck) {
		int empWrkHrs;
		switch (empCheck) {
		case IS_FULL_TIME -> empWrkHrs = 8;
		case IS_PART_TIME -> empWrkHrs = 4;
		default -> empWrkHrs = 0;
		}
		int empWage = empWrkHrs * EMP_WAGE_PER_DAY;
		return empWage;
	}

	public static int totalEmpSalary() {
		int day = 0;
		int totalEmpSalary = 0;
		int empWage = 0;
		int empCheck = 0;
		while (day < EMP_WAGE_FOR_MONTH) {
			empCheck = empCheck();
			empWage = empSalary(empCheck);
			++day;
			totalEmpSalary += empWage;
		}
		return totalEmpSalary;
	}

}

public class EmployeeWageComputation {

	public static void main(String[] args) {
		int empCheck, empWage, totalEmpSalary;
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		totalEmpSalary = Employe.totalEmpSalary();
		System.out.println("totalEmpSalary = " + totalEmpSalary);
	}

}