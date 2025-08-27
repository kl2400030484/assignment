// CompoundInterest.java

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of Interest (%): ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (years): ");
        int t = sc.nextInt();

        // Formula: A = P * (1 + R/100)^T
        double amount = p * Math.pow((1 + r / 100), t);
        double ci = amount - p;

        System.out.printf("\nCompound Interest: %.2f\n", ci);
        System.out.printf("Total Amount: %.2f\n", amount);

        sc.close();
    }
}
