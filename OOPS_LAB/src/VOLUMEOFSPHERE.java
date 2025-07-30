import java.util.Scanner;
public class VOLUMEOFSPHERE {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter radius:\t");
			int r=sc.nextInt();
			double volume = (4.0/3)*Math.PI*r*r*r;
			System.out.println("Volume of sphere is: " +volume);
		}

	}

}
