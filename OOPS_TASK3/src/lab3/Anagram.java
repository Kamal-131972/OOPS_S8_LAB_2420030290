package lab3;

import java.util.Scanner;
import java.util.Arrays;
public class Anagram {

  public static void main(String[] args) {
    try (
	Scanner sc = new Scanner(System.in)) {
		String s1;
		String s2;
		System.out.print("Enter String 1:");
		s1=sc.next();
		System.out.print("Enter String 2:");
		s2=sc.next();
   String S1= s1.toUpperCase();
   String S2= s2.toUpperCase();
		char[] array1=S1.toCharArray();
		char[] array2=S2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		if(Arrays.equals(array1, array2)) {
		  System.out.println("Given Strings are anagrams");
		}
		else {
		  System.out.println("Given strings are not anagrams");
		}
	}

}
}
