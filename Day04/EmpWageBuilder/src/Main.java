public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        int attendance;
        for(int i = 1; i <= employee.totalWorkingDays; i++) {
            if(employee.workHours <= employee.totalWorkingHours) {
                attendance = employee.employeeAttendance();
                System.out.print("Day " + i);
                System.out.println("Daily wage : " + employee.employeeDailyWage(attendance));
            } else {
                break;
            }
        }
        employee.totalWage();
    }
}
