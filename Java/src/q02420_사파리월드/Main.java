package q02420_사파리월드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		BigInteger N = new BigInteger(input[0]);
		BigInteger M = new BigInteger(input[1]);
		BigInteger zero = new BigInteger("0");
		BigInteger negative = new BigInteger("-1");
		BigInteger minus = N.subtract(M);
		
		// BigInteger 끼리 비교할 때는 compareTo()함수를 사용한다.
		// 같을 때는 == 0 양수이면 == 1 음수이면 == -1 이다.
		if (minus.compareTo(zero) == -1) System.out.println(minus.multiply(negative));
		else System.out.println(minus);

	}

}
