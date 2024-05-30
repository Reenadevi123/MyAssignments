package week1.day2;

import java.util.Scanner;

public class Amstrong_number {

	public static void main(String[] args) {
		int result=0,reminder;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=s.nextInt();
		int actual=num;
		while(num>0) {
			reminder=num%10;
			num=num/10;
			result=result+(reminder*reminder*reminder);
		}
		if(actual==result) {
			System.out.println("The number is an Amstrong number");
		}
		else {
			System.out.println("The number is not an Amstrong number");
		}
	}

}
