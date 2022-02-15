package javapractice;

import java.util.Scanner;

public class LineLength {

	public static int getLengthOfLine(Scanner sc) {
        int x1,x2,y1,y2;
        System.out.println("Enter x1 and y1 values : ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();

        System.out.println("Enter x2 and y2 values : ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        int result_1 = (int) Math.pow((x2-x1), 2);
        int result_2 = (int) Math.pow((y2-y1), 2);
        double length = Math.sqrt(result_1 + result_2);

        return (int) length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter values for line 1");
        int lengthOfLine_1 = getLengthOfLine(scanner);
        System.out.println("Please enter values for line 2");
        int lengthOfLine_2 = getLengthOfLine(scanner);

        String str_1 = String.valueOf(lengthOfLine_1);
        String str_2 = String.valueOf(lengthOfLine_2);

        if(str_1.equals(str_2)){
            System.out.println("Both lines are equal");
        }
        else {
            System.out.println("Both lines are not equal");
        }
        scanner.close();
    }
}
