import java.util.Scanner;
public class ADDITION {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Num1:\t");
			int a=sc.nextInt();
			System.out.print("Enter Num2:");
			int b=sc.nextInt();
			int c=a+b;
			System.out.println("Sum is:" +c);
		}

	}

}