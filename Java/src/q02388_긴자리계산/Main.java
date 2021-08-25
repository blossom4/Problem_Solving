package q02388_긴자리계산;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		// BigInteger는 일반적인 operator로 계산할 수 없다.
		// 더하기: add(), 빼기: subtract(), 곱하기: multiply(), 나누기: divide()
		BigInteger A = input.nextBigInteger();
		BigInteger B = input.nextBigInteger();
		
		System.out.println(A.add(B));
		System.out.println(A.subtract(B));
		System.out.println(A.multiply(B));
	}

}