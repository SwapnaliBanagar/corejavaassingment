package Ifelse;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int number=sc.nextInt();
		if(number%2==0) {
			System.out.println("Entered Number Is Even"); 
		}
		else {
			System.out.println("Entered Number Is Odd"); 
		}
	}
}
 