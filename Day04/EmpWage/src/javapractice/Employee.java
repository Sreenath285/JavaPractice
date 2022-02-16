package javapractice;

public class Employee {

	public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_TIME_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;
    public static final int WORKING_DAYS_PER_MONTH = 20;
    public static final int TOTAL_WORKING_HOURS = 100;
    int salary = 0;
    int workedHours = 0;


    int employeeAttendance() {
        int isPresent = (int) Math.floor(Math.random() * 10) % 3;
        return isPresent;
    }

    int employeeDayWage(int isPresent) {
        int dayWage = 0;
        switch (isPresent) {
            case 1:
                System.out.println(" - Present and Working part time.");
                dayWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                salary = salary + (WAGE_PER_HOUR * PART_TIME_HOUR);
                workedHours = workedHours + PART_TIME_HOUR;
                break;
            case 2:
                System.out.println(" - Present and Working full time.");
                dayWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
                salary = salary + (WAGE_PER_HOUR * FULL_TIME_HOUR);
                workedHours = workedHours + FULL_TIME_HOUR;
                break;
            case 0:
                System.out.println(" - Absent");
                break;
        }
        System.out.println("Worked " + workedHours + " hours");
        return dayWage;
    }

    void printMonthWage() {
        System.out.println("Employee worked " + workedHours + " hours and earned Rs. " + salary + " this month.");
    }
}
