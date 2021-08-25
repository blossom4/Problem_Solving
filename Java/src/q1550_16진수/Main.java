package q1550_16진수;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		// 16진수 숫자
		String N_16 = "0123456789ABCDEF";
		String N = input.next();
		// 일의 자리부터 16씩 곱해가며 자리수를 올리기 위해 16진수 수를 뒤집는다.
		StringBuffer sbN = new StringBuffer(N);
		String reverseN = sbN.reverse().toString();
		int N_10 = 0;
		
		// 일의 자리부터 해당하는 문자의 index가 10진수로 변환한 수와 같다.
		for (int i = 0; i < reverseN.length(); i++) {
			N_10 += N_16.indexOf(reverseN.charAt(i)) * Math.pow(16, i);
		}
		
		System.out.println(N_10);
	}

}