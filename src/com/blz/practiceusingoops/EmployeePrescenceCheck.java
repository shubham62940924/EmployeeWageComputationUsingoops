package com.blz.practiceusingoops;

import java.util.Random;

class Employee {
	static final int IS_FULL_TIME = 1;

	public static void empCheckPrescence() {
		Random rand = new Random();
		int empCheck = rand.nextInt(2);
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee  is absent ");
		}
	}

	public class EmployeePrescenceCheck {

		public static void main(String[] args) {
			System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
			Employee.empCheckPrescence();
		}
	}

}
