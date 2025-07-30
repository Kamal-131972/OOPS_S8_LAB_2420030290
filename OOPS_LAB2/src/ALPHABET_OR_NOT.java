import java.util.Scanner; 
public class ALPHABET_OR_NOT {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in)) {
			System.out.println("enter a character:");
   
			   char ch =sc.next().charAt(0);
			   if(ch>='A' && ch<='Z'||ch>='a' && ch<='z' ) {
			     System.out.println("It is alphabet" +ch);
			   }else {
			     System.out.println("It is not an alphabet" +ch);
			     
			   }
		 }
	       }
	       

	}