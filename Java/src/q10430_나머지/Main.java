package q10430_������;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		// JAVA������ �Է��� ���� �� ���� ����ó���� �����ʿ����
		// �ڵ����� ������ �������� ������ ������ �Է��̵ȴ�.
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		
		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);
	}
}
