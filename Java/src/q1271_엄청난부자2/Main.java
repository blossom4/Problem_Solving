package q1271_엄청난부자2;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		// BigInteger 무한히  큰 수를 입력할 때 사용한다.
		BigInteger n = input.nextBigInteger();
		BigInteger m = input.nextBigInteger();
		
		// 몫
		System.out.println(n.divide(m));
		// 나머지
		System.out.println(n.mod(m));
	}
}
