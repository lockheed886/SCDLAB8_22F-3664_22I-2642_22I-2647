package question1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    public int getValidInput(Scanner scanner, String prompt) {
        int num;
        while (true) {
            System.out.print(prompt);
            try {
                num = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); 
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner s = new Scanner(System.in);

        int n1 = cal.getValidInput(s, "Enter the 1st number: ");
        int n2 = cal.getValidInput(s, "Enter the 2nd number: ");
        
        int ans = cal.addition(n1, n2);
        System.out.println("Ans: " + ans);

        s.close();
    }
}