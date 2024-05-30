package week1.day2;

import java.util.Scanner;

public  class Prime {

	public static boolean isPrime(int num) {

		// Write your code here		
		boolean flag=true;
		if(num<=1) {
			flag=false;
			return flag;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		return flag;

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		if(isPrime(number)) {
			System.out.println("The number is Prime");
		}
		else   {
			System.out.println("The number is not prime");

		}
	}
}







