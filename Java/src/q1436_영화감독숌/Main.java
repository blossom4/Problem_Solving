package q1436_��ȭ������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int endNumber = 666;
		int cnt = 0;
		// �ּ��� ���������� 666���� �����ؼ� 666�� ���Ե� ���ڸ� ������ cnt +1�� �Ѵ�.
		while (true) {
			if (Integer.toString(endNumber).contains("666")) cnt++;
			if (N == cnt) break;
			
			endNumber++;
		}
		
		System.out.println(endNumber);		
	}

}
