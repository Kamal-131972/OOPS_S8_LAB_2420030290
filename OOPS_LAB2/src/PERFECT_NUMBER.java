import java.util.Scanner; 
public class PERFECT_NUMBER {
public static void main (String[] args) {
	
try (Scanner sc = new Scanner(System.in)) {
	System.out.print("Enter Number:\t");
	       int n=sc.nextInt();
	       int a=0;
	       if(n<=0) {
	         System.out.print(false);
	         return;
	       }
	       for(int i=1;i<n;i++) {
	         if(n%i==0) {
	           a+=i;           
	         }
	       }
	       if(a==n) {
	         System.out.println(n+ " is a perfect number");
	       }
	       else {
	         System.out.println(n+ " is not a perfect number");
	       }
}
  }
  
}