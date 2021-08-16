package q8437_Julka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger total = new BigInteger(br.readLine());
		BigInteger diff = new BigInteger(br.readLine());
		
		// int나 long의 범위를 벗어나는 수의 연산을 할 때는 BigInteger를 사용한다.
		// 특정 수를 BigInteger로 변환하고 싶으면 BigInteger.valueOf() 함수를 사용한다.
		BigInteger Klaudia = total.add(diff);
		BigInteger Natalia = total.subtract(diff);
		System.out.println(Klaudia.divide(BigInteger.valueOf(2)));
		System.out.println(Natalia.divide(BigInteger.valueOf(2)));
	}

}
