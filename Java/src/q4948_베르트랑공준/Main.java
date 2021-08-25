package q4948_베르트랑공준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	// 에라스토테네스의 체의 원리를 이용한 소수를 구하는 함수
	public static boolean isPrimeNumber(int n) {
		if (Math.sqrt((double)n) == Math.ceil(Math.sqrt((double)n))) return false;
		
		for (int i = 2; i < Math.sqrt((double)n); i++) {
			if (n % i == 0) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> results = new ArrayList<String>();

		while (true) {
			int cnt = 0;
			// 입력이 0이 들어올 때까지 반복하고 0이 들어오면 break
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			
			// n보다 크고 2n 이하의 범위에서 소수의 개수를 구한다.
			for (int i = n + 1; i < 2 * n + 1; i++) {
				if (isPrimeNumber(i) == true) cnt++;
			}
			// results ArrayList에 결과들을 저장한다.
			results.add(Integer.toString(cnt));
		}
		
		System.out.println(String.join("\n", results));
	}

}