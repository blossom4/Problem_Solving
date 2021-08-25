package q2588_곱셈;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println(num1 * (num2 % 10));
		System.out.println((num1 * ((num2 / 10) % 10)));
		System.out.println(num1 * (num2 / 100));
		System.out.println(num1 * num2);
	}

}
