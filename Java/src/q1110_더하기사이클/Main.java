package q1110_���ϱ����Ŭ;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		// ������ N�� ���������� ���Ȯ���ؾ��ϹǷ� �ʱ��� N���� �ӽ�����
		int temp = N;
		int count = 1;
		
		// ó�� �ѹ� ����Ŭ ���� �� N == temp��� ���̻� ����Ŭ�� �����ʿ�����Ƿ� count ���
		if (N < 10) N *= 11;
		else N = (N % 10) * 10 + (N / 10 + N % 10) % 10;
		
		// ���� �޶����ٸ� ������������ �ݺ��ϸ� count +1
		while (N != temp) {
			if (N < 10) N *= 11;
			else N = (N % 10) * 10 + (N / 10 + N % 10) % 10;
			
			count++;
		}
		
		System.out.println(count);

	}

}
