package question1;

import java.util.Scanner;

public class Calculator {

   
    public int multiplication(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        Calculator calc = new Calculator();
        int result = calc.multiplication(num1, num2);
        
        System.out.println("Multiplication result: " + result);
        
        scanner.close();
    }
}
