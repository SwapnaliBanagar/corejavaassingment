package Function;

import java.util.Scanner;

public class table {
	public static int table(int number)
	{
		int mul=1;
		for(int i=1;i<=10; i++)
		{
			mul=number*i;
			System.out.println(mul);
		}
		return number;

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int number=sc.nextInt();
		int table=table(number);

	}

}
