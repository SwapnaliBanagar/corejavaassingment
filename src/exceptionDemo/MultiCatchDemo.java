package exceptionDemo;

public class MultiCatchDemo {

	public static void main(String[] args) {
		try
		{
			//System.out.println(10/0);
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException | ArithmeticException e)
		{
			e.printStackTrace();
		}

	}

}
