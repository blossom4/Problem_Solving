package q08437_Julka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger total = new BigInteger(br.readLine());
		BigInteger diff = new BigInteger(br.readLine());
		
		// int�� long�� ������ ����� ���� ������ �� ���� BigInteger�� ����Ѵ�.
		// Ư�� ���� BigInteger�� ��ȯ�ϰ� ������ BigInteger.valueOf() �Լ��� ����Ѵ�.
		BigInteger Klaudia = total.add(diff);
		BigInteger Natalia = total.subtract(diff);
		System.out.println(Klaudia.divide(BigInteger.valueOf(2)));
		System.out.println(Natalia.divide(BigInteger.valueOf(2)));
	}

}
