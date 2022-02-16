package javapractice;

public class EmpPresentOrAbsent {
	
	int employeeAttendance() {
        int isPresent = (int) Math.floor(Math.random() * 10) % 2;
        if (isPresent == 1) {
        	System.out.println("Employee is present");
        }
        else {
        	System.out.println("Employee is absent");
        }
        return isPresent;
    }

}
