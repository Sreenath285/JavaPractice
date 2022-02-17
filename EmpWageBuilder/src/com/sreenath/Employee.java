package com.sreenath;

public class Employee {

    public int wagePerHour = 20;
    public int isFullTime = 8;
    public int isPartTime = 4;
    int dailyWage = 0;

    int employeeAttendance() {
        int isPresent = (int) Math.floor(Math.random() * 10) % 3;
        if (isPresent == 1) {
            System.out.println("Employee is present and working full time");
            dailyWage += wagePerHour * isFullTime;
            System.out.println("Daily wage : " + dailyWage);
        }
        else if (isPresent == 2) {
            System.out.println("Employee is and working part time");
            dailyWage += wagePerHour * isPartTime;
            System.out.println("Daily wage : " + dailyWage);
        }
        else {
            System.out.println("Employee is absent");
            System.out.println("Daily wage : " + dailyWage);
        }
        return isPresent;
    }
}
