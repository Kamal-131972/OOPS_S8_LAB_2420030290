import java.util.Scanner;
public class TEMPERATURE {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the celsius :\t");
			   int cel=sc.nextInt();
			   int fah= cel*(9/5)+32;
			   System.out.println("Converted temparature is :" +fah);
		}

	}

}
