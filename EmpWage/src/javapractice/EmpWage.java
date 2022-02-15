package javapractice;

public class EmpWage {
	

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS = 100;

    public static void main(String[] args) {

        int empHrs = 0, empWage = 0, totalEmpHrs = 0, totalWorkDays = 0, totalEmpWage = 0;
        while (totalEmpHrs <= MAX_HRS && totalWorkDays < NO_OF_WORKING_DAYS) {
            totalWorkDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            empWage = empHrs * WAGE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Employee Wage : " + empWage);
        }
        System.out.println("Total Emp Wage : " + totalEmpWage);
    }

}
