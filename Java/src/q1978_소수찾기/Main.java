package q1978_소수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static boolean isPrimeNumber(int n) {
		
		if (n == 1) return false;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		String[] input = br.readLine().split(" ");
		
		for (int i = 0; i < N; i++) {
			if (isPrimeNumber(Integer.parseInt(input[i])) == true) cnt++;
		}
		
		System.out.println(cnt);
	}

}
