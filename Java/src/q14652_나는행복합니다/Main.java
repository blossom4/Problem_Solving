package q14652_나는행복합니다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		// N, M, K
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		int K = Integer.parseInt(input[2]);
		int n = 0;
		
		for (int i = 0; i < N * M; i++) {
			// 좌석번호를 매겨가면서 내 자리인지 검사한다.
			if (K == n) {
				break;
			}
			n++;
		}
		
		// 몫은 좌석의 세로축, 나머지는 좌석의 가로축이다.
		System.out.println(n / M + " " + n % M);
	}

}
