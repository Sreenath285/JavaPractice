package javapractice;

public class Main {
	
	public static void main(String[] args) {
        Employee employee = new Employee();
        int attendance;
        for(int i = 1; i <= Employee.WORKING_DAYS_PER_MONTH; i++) {
            if(employee.workedHours <= employee.TOTAL_WORKING_HOURS) {
                attendance = employee.employeeAttendance();
                System.out.print("Day:" + i);
                System.out.println("Day Wage: Rs. " + employee.employeeDayWage(attendance));
            } else {
                break;
            }
        }
        employee.printMonthWage();
    }

}
