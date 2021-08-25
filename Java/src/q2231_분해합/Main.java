package q2231_분해합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	// 분해합을 구하는 함수
	public static int getCalculation(int n) {
		int sum = n;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		
		// 1부터 분해합이 N이 되는지 검사하고 만족하면 break;
		// 1부터 검사하므로 최초로 만족하는 생성자가 최소값이다.
		for (int i = 1; i < N + 1; i++) {
			if (getCalculation(i) == N) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}

}
