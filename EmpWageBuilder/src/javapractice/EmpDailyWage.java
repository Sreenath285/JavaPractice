package javapractice;

public class EmpDailyWage {
	
	public int wagePerHour = 20;
    public int isFullTime = 8;
    int dailyWage = 0;
	
	int employeeAttendance() {
        int isPresent = (int) Math.floor(Math.random() * 10) % 2;
        if (isPresent == 1) {
        	System.out.println("Employee is present");
        	dailyWage += wagePerHour * isFullTime;
        	System.out.println("Daily wage : " + dailyWage);
        }
        else {
        	System.out.println("Employee is absent");
        	System.out.println("Daily wage : " + dailyWage);
        }
        return isPresent;
    }
}
