package q10872_ÆÑÅä¸®¾ó;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	// ÆÑÅä¸®¾ó Àç±ÍÇÔ¼ö
	public static int factorial(int n) {
		if (n == 0) return 1;
		else if (n < 2) return n;
		else return factorial(n - 1) * n;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(factorial(Integer.parseInt(br.readLine())));
	}

}
