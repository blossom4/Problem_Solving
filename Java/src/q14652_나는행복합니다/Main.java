package q14652_�����ູ�մϴ�;

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
			// �¼���ȣ�� �Űܰ��鼭 �� �ڸ����� �˻��Ѵ�.
			if (K == n) {
				break;
			}
			n++;
		}
		
		// ���� �¼��� ������, �������� �¼��� �������̴�.
		System.out.println(n / M + " " + n % M);
	}

}
