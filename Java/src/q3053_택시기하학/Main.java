package q3053_�ýñ�����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine());
		String result = "";
		
		// ��Ŭ���� �����п��� ���� ����
		result += Math.PI * Math.pow(R, 2);
		result += "\n";
		// �ý� �����п��� ���� ����
		result += 2 * (Math.pow(R, 2));
		
		System.out.println(result);
	}

}
