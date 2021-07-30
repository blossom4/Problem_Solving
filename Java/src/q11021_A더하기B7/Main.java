package q11021_A¥ı«œ±‚B7;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		for (int i = 1; i < T + 1; i++) {
			int A = input.nextInt();
			int B = input.nextInt();
			System.out.println("Case #" + i + ": " + (A + B));
		}
	}

}
