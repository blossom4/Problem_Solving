package q2231_������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	// �������� ���ϴ� �Լ�
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
		
		// 1���� �������� N�� �Ǵ��� �˻��ϰ� �����ϸ� break;
		// 1���� �˻��ϹǷ� ���ʷ� �����ϴ� �����ڰ� �ּҰ��̴�.
		for (int i = 1; i < N + 1; i++) {
			if (getCalculation(i) == N) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}

}
