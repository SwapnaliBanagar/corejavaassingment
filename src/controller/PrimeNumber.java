package controller;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int number = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= number; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {

				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}

