package week1.day2;

public class Swapping {
	public static void main(String[]args)
	{
		int a = 10;
		int b = 20;
		int temp;
		System.out.println("Before swapping ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		temp = a;  // 10
		a = b;   // 20
		b = temp;  // 20
		System.out.println("After swapping ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
