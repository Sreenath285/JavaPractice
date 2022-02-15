package javapractice;

public class EmpWage {
	
	 public static void main(String[] args) {
	        int IS_FULL_TIME = 1;
	        int WAGE_PER_HOUR = 20;
	        int empHrs = 0, empWage = 0;
	        double empCheck = Math.floor(Math.random() * 10) % 2;
	        if (empCheck == IS_FULL_TIME) {
	            empHrs = 8;
	        }
	        else {
	            empHrs = 0;
	        }
	        empWage = empHrs * WAGE_PER_HOUR;
	        System.out.println("Employee Wage : " + empWage);
	    }
}
