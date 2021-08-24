package q11653_���μ�����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ���μ��� ������ ArrayList
		ArrayList<String> factor = new ArrayList<String>();
		int N = Integer.parseInt(br.readLine());
		int i = 2;
		
		// ���μ��� ��� ������ N�� 1��
		while (N != 1) {
			// ���μ��̸� N�� ������ ���μ��� ArrayList�� �����Ѵ�.
			if (N % i == 0) {
				N /= i;
				factor.add(Integer.toString(i));
			}
			// ������ �������� ���μ��� �ƴϸ� +1�ؼ� ���μ� �˻縦 �����Ѵ�.
			else i++;
		}
		
		System.out.println(String.join("\n", factor));
	}

}