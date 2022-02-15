package javapractice;

import java.util.Scanner;

public class LineLength {

	public static int lengthOfLine(Scanner sc) {

        int x1,x2,y1,y2;
        System.out.println("Enter x1 and y1 values : ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();

        System.out.println("Enter x2 and y2 values : ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        int result_1 = (int) Math.pow((x2-x1), 2);
        int result_2 = (int) Math.pow((y2-y1), 2);
        int length = (int) Math.sqrt(result_1 + result_2);

        return length;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lengthOfLine = lengthOfLine(scanner);
        System.out.println("Length : " + lengthOfLine);
        scanner.close();
    }
}
