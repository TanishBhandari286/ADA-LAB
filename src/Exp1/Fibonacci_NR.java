package Exp1;
import java.util.Scanner;
public class Fibonacci_NR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student name --> Tanish Bhandari");
        System.out.println("Student Roll Number --> 23csu311");
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        if(n==0){
            System.out.println("Invalid input");
        }
        if (n >=1) {
            int first = 0, second = 1;
            System.out.print(first + " ");
            for (int i = 2; i <= n; i++) {
                System.out.print(second + " ");
                int next = first + second;
                first = second;
                second = next;
            }
        }
    }
}