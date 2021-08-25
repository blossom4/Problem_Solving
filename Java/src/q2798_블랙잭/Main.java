package q2798_블랙잭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		String[] numbersStr = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		int[] numbers = new int[N];
		int max = -1;
		
		// 입력받은 숫자들을 정수로 타입을 바꾸고 배열에 저장한다.
		for (int i = 0; i < N; i++) numbers[i] = Integer.parseInt(numbersStr[i]);
		
		// 숫자배열을 3중 for문을 돌면서 모든 경우의 수를 탐색한다.
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					// M이 넘어버리면 블랙잭 조건을 만족하지 못하므로 continue
					// 최대값보다 크면 값을 갱신한다.
					if (numbers[i] + numbers[j] + numbers[k] > M) continue;
					if (numbers[i] + numbers[j] + numbers[k] > max) max = numbers[i] + numbers[j] + numbers[k];
				}
			}
		}
		
		System.out.println(max);
	}

}