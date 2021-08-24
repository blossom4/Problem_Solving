package q4948_����Ʈ������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	// �������׳׽��� ü�� ������ �̿��� �Ҽ��� ���ϴ� �Լ�
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
			// �Է��� 0�� ���� ������ �ݺ��ϰ� 0�� ������ break
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			
			// n���� ũ�� 2n ������ �������� �Ҽ��� ������ ���Ѵ�.
			for (int i = n + 1; i < 2 * n + 1; i++) {
				if (isPrimeNumber(i) == true) cnt++;
			}
			// results ArrayList�� ������� �����Ѵ�.
			results.add(Integer.toString(cnt));
		}
		
		System.out.println(String.join("\n", results));
	}

}
