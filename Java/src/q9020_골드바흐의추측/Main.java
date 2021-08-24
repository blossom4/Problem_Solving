package q9020_������������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	// �������׳׽��� ü�� ������ �̿��Ͽ� �Ҽ����� �ƴ��� ���ϴ� �Լ�
	public static boolean isPrimeNumber(int n) {
		// ������������ ��� false
		if (Math.sqrt((double)n) == Math.ceil(Math.sqrt((double)n))) return false;
		
		// �Ҽ��� �Ǻ��� �ڿ��� n�� ������ ������ ������� �ȴ�.
		for (int i = 2; i < Math.sqrt((double)n); i++) {
			if (n % i == 0) return false;
		}
		
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		// ������� ������ ũ�� T�� Array�̴�.
		String[] results = new String[T];
		
		for (int tc = 0; tc < T; tc++) {
			int n = Integer.parseInt(br.readLine());
			// �������� ������ �����ϴ� ��������� ���� �ִٸ� ���̰� ���� ���� ����� ����ؾ��ϹǷ�,
			// �߰������� �����Ͽ� ���̸� ���������鼭 �����ϴ� ��츦 ã�´�.
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
