package q10872_팩토리얼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	// 팩토리얼 재귀함수
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