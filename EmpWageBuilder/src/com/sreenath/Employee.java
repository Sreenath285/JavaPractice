package com.sreenath;

public class Employee {
    public int wagePerHour = 20;
    public int isFullTime = 8;
    public int isPartTime = 4;
    int dailyWage = 0;

    int employeeAttendance() {
        int isPresent = (int) Math.floor(Math.random() * 10) % 3;
        switch (isPresent) {
            case 1:
                System.out.println("Employee is present and working full time");
                dailyWage += wagePerHour * isFullTime;
                System.out.println("Daily wage : " + dailyWage);
                break;
            case 2:
                System.out.println("Employee is and working part time");
                dailyWage += wagePerHour * isPartTime;
                System.out.println("Daily wage : " + dailyWage);
                break;
            default:
                System.out.println("Employee is absent");
                System.out.println("Daily wage : " + dailyWage);
                break;
        }
        return isPresent;
    }
}
