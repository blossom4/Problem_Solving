package q13277_큰수곱셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		BigInteger A = new BigInteger(input[0]);
		BigInteger B = new BigInteger(input[1]);
		
		System.out.println(A.multiply(B));
	}

}
