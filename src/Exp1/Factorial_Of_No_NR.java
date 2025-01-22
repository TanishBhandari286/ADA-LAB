package Exp1;
import java.util.Scanner;

public class Factorial_Of_No_NR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student name --> Tanish Bhandari");
        System.out.println("Student Roll Number --> 23csu311");
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("No factorial can be found for negative numbers.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of the input given is: " + factorial);
        }
    }
}
