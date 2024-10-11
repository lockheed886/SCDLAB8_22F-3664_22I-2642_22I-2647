package question1;
import java.util.Scanner;

public class Calculator {

	public int addition(int num1, int num2)
	{
		return (num1+num2);
	}

	public static void main(String[] args) {
		
		Calculator cal =  new Calculator();
		Scanner s = new Scanner(System.in);
		
		int n1 = 5, n2 = 10;
		System.out.println("Enter the 1st number: ");
		n1 = s.nextInt();
		
		System.out.println("Enter the 2nd number: ");
		n2 = s.nextInt();
		
		int ans = cal.addition(n1, n2);
		System.out.println("Ans: " + ans);

	}


}
