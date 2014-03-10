
import java.util.Scanner;

public class Lab4 {

	private static Scanner k;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Input;
		int Input2;
		System.out.println("Enter a number:");
		k = new Scanner(System.in);
		Input = k.nextInt();
		System.out.println("Enter another number:");
		Input2 = k.nextInt();
		System.out.printf("Hello, you have entered the numbers %d and %d", Input, Input2);


	}

}
