package q15894_수학은체육과목입니다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger n = new BigInteger(br.readLine());
		
		System.out.println(n.multiply(BigInteger.valueOf(4)));
	}

}