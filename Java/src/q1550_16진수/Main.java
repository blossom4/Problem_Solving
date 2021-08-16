package q1550_16����;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		// 16���� ����
		String N_16 = "0123456789ABCDEF";
		String N = input.next();
		// ���� �ڸ����� 16�� ���ذ��� �ڸ����� �ø��� ���� 16���� ���� �����´�.
		StringBuffer sbN = new StringBuffer(N);
		String reverseN = sbN.reverse().toString();
		int N_10 = 0;
		
		// ���� �ڸ����� �ش��ϴ� ������ index�� 10������ ��ȯ�� ���� ����.
		for (int i = 0; i < reverseN.length(); i++) {
			N_10 += N_16.indexOf(reverseN.charAt(i)) * Math.pow(16, i);
		}
		
		System.out.println(N_10);
	}

}
