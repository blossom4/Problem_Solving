package q1271_��û������2;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		// BigInteger ������  ū ���� �Է��� �� ����Ѵ�.
		BigInteger n = input.nextBigInteger();
		BigInteger m = input.nextBigInteger();
		
		// ��
		System.out.println(n.divide(m));
		// ������
		System.out.println(n.mod(m));
	}
}
