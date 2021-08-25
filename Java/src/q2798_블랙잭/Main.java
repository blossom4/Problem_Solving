package q2798_����;

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
		
		// �Է¹��� ���ڵ��� int�� Ÿ���� �ٲٰ� �迭�� �����Ѵ�.
		for (int i = 0; i < N; i++) numbers[i] = Integer.parseInt(numbersStr[i]);
		
		// ���ڹ迭�� 3�� for���� ���鼭 ��� ����� ���� Ž���Ѵ�.
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					// M�� �Ѿ������ ���� ������ �������� ���ϹǷ� continue
					// �ִ밪���� ũ�� ���� �����Ѵ�.
					if (numbers[i] + numbers[j] + numbers[k] > M) continue;
					if (numbers[i] + numbers[j] + numbers[k] > max) max = numbers[i] + numbers[j] + numbers[k];
				}
			}
		}
		
		System.out.println(max);
	}

}
