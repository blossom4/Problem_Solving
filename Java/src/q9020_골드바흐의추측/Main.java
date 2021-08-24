package q9020_골드바흐의추측;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	// 에라스토테네스의 체의 원리를 이용하여 소수인지 아닌지 구하는 함수
	public static boolean isPrimeNumber(int n) {
		// 완전제곱수일 경우 false
		if (Math.sqrt((double)n) == Math.ceil(Math.sqrt((double)n))) return false;
		
		// 소수를 판별할 자연수 n의 제곱근 까지만 나누어보면 된다.
		for (int i = 2; i < Math.sqrt((double)n); i++) {
			if (n % i == 0) return false;
		}
		
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		// 결과들을 저장할 크기 T의 Array이다.
		String[] results = new String[T];
		
		for (int tc = 0; tc < T; tc++) {
			int n = Integer.parseInt(br.readLine());
			// 골드바흐의 추측을 만족하는 여러경우의 수가 있다면 차이가 적은 것을 결과로 출력해야하므로,
			// 중간값부터 시작하여 차이를 벌려나가면서 만족하는 경우를 찾는다.
			int n1 = n / 2;
			int n2 = n / 2;
	
			while (true) {			
				if (isPrimeNumber(n1) == true && isPrimeNumber(n2) == true) {
					results[tc] = String.join(" ", Integer.toString(n1), Integer.toString(n2));
					break;
				}
				
				n1--;
				n2++;
			}
		}
		
		System.out.println(String.join("\n", results));
	}
	
}
