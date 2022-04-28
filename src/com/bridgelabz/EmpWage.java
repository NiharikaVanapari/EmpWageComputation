package com.bridgelabz;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage computation program");
		 int empPresent = 1;
	        int empCheck = (int) (Math.random() * 10) % 2;
	        if (empCheck == empPresent) {
	            System.out.println("Employee Present");
	        } else {
	            System.out.println("Employee Absent");
	        }
		
	}

}
