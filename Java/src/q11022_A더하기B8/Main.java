package q11022_A¥ı«œ±‚B8;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		for (int t = 1; t < T + 1; t++) {
			int A = input.nextInt();
			int B = input.nextInt();
			
			System.out.println("Case #" + t + ": " + A + " + " + B + " = " + (A + B));
		}

	}

}

