package week1.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		String str1,str2;
		Scanner ana=new Scanner(System.in);
		System.out.println("Enter the first String:");
		str1=ana.next();
		System.out.println("Enter the Second String:");
		str2=ana.next();
char[] array1=str1.toCharArray();
char[] array2=str2.toCharArray();
Arrays.sort(array1);
Arrays.sort(array2);
boolean equal=Arrays.equals(array1, array2);
if(equal) {
	System.out.println("First string "+str1+" and second string "+str2+" are anagram");
}else {
	System.out.println("First string "+str1+" and second string "+str2+" are not anagram");
}
	}

}
