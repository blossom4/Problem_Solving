package q2388_���ڸ����;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		// BigInteger�� �Ϲ����� operator�� ����� �� ����.
		// ���ϱ�: add(), ����: subtract(), ���ϱ�: multiply(), ������: divde()
		BigInteger A = input.nextBigInteger();
		BigInteger B = input.nextBigInteger();
		
		System.out.println(A.add(B));
		System.out.println(A.subtract(B));
		System.out.println(A.multiply(B));
	}

}
