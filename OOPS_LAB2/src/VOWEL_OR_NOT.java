import java.util.Scanner; 
public class VOWEL_OR_NOT {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the alphabet\t");
			   char al=sc.next().charAt(0);
			   if(al=='a'||al=='e'||al=='i'||al=='o'||al=='u'||al=='A'||al=='E'||al=='I'||al=='O'||al=='U') {
			     System.out.print("It is a Vowel\t");
			   }
			   else {
			     System.out.print("It is a constants\t");
			   }
		 }

		  }


	}