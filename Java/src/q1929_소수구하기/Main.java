package q1929_�Ҽ����ϱ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	// �Ҽ����� ���ϴ� �Լ�
	// �����佺�׳׽��� ü�� ������ ���� n�� ������ ������ �˻��ص� �ȴ�.
	public static boolean isPrimeNumber(int n) {	
		// �����������̸� �����Ѵ�.
		if (Math.sqrt((double)n) == Math.ceil(Math.sqrt((double)n))) return false;
		
		for (int i = 2; i < Math.sqrt((double)n); i++) {
			if (n % i == 0) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int M = Integer.parseInt(input[0]);
		int N = Integer.parseInt(input[1]);
		// ���� ���� �Ҽ��� ������ ArrayList
		ArrayList<String> primeNumber = new ArrayList<String>();
			
		for (int i = M; i < N + 1; i++) {
			if (isPrimeNumber(i) == true) primeNumber.add(Integer.toString(i));
		}
		
		System.out.println(String.join("\n", primeNumber));
	}

}
