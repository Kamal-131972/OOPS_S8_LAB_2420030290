import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter num1\t");
			int num1=sc.nextInt();
			System.out.print("Enter num2\t");
			int num2=sc.nextInt();
			while(num1!=num2) {
			  if(num1>num2) {
			    num1-=num2;
			  }
			  else {
			    num2 -=num1;
			  }
			}
			System.out.println("gcd is " +num1);
		}
          }

}