package lab4;
import Mypackage.Calculator;
import java.util.Scanner;
public class Use_calculator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		System.out.print("Enter First number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second number: ");
		int num2 = sc.nextInt();
		System.out.println("Addition: " + calc.add(num1,  num2));
		System.out.println("Subtraction: " + calc.subtract(num1, num2));
		

	}

}
