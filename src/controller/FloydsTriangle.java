package controller;

public class FloydsTriangle {

	public static void main(String[] args) {
		int k=1;
		for(int i=1; i<6; i++)
		{
			for(int j=1; j<i+1; j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println(" ");
		}

	}

}
