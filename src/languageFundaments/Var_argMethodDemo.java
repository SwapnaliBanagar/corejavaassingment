package languageFundaments;

public class Var_argMethodDemo {

	public static void m1(int... x)
	{
		System.out.println("Var-arg Method"+" ,The numbers Of arguments = "+x.length);
	}
	public static void main(String[] args) {
		m1();
		m1(10,20);
		m1(10,20,30,40);

	}

}
