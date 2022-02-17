public class Employee {

    public int wagePerHour = 20;
    public int isFullTime = 8;
    public int isPartTime = 4;
    public int totalWorkingDays = 20;
    public int totalWorkingHours = 100;
    int salary = 0;
    int workHours = 0;

    public int employeeAttendance() {
        int isPresent = (int) Math.floor(Math.random() * 10) % 3;
        return isPresent;
    }

    public int employeeDailyWage(int isPresent) {
        int dailyWage = 0;
        switch (isPresent) {
            case 1:
                System.out.println(" : working part time");
                dailyWage = wagePerHour * isPartTime;
                salary = salary + (wagePerHour * isPartTime);
                workHours = workHours + isPartTime;
                break;
            case 2:
                System.out.println(" : working full time");
                dailyWage = wagePerHour * isFullTime;
                salary = salary + (wagePerHour * isFullTime);
                workHours = workHours + isFullTime;
                break;
            default:
                System.out.println(" : absent");
                break;
        }
        System.out.println("working hours : " + workHours);
        return dailyWage;
    }

    public void totalWage() {
        System.out.println("Total working hours : " + workHours);
        System.out.println("Total salary :  " + salary);
    }
}
