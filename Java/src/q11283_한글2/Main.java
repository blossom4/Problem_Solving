package q11283_�ѱ�2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		char result = input.charAt(0);
		
		// �ѱ��� ascii code�� 44032����  ������� ����Ǿ��ִ�.
		System.out.println(((int) result) - 44031);
	}

}
