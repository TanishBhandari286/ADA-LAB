package Exp1;
import java.math.BigInteger;
import java.util.Scanner;
public class Factorial_R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            BigInteger result = factorial(BigInteger.valueOf(n));
            System.out.println("The factorial of is");
            System.out.println(result);
        }
    }
    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
