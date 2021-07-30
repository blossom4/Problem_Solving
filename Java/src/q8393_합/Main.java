package q8393_гу;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int sum = 0;
		
		for (int i = 1; i < n + 1; i++) sum += i;
		
		System.out.println(sum);
	}

}
