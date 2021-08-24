package q11653_소인수분해;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 소인수를 저장할 ArrayList
		ArrayList<String> factor = new ArrayList<String>();
		int N = Integer.parseInt(br.readLine());
		int i = 2;
		
		// 소인수로 모두 나눠서 N이 1이
		while (N != 1) {
			// 소인수이면 N을 나누고 소인수를 ArrayList에 저장한다.
			if (N % i == 0) {
				N /= i;
				factor.add(Integer.toString(i));
			}
			// 나누어 떨어지는 소인수가 아니면 +1해서 소인수 검사를 진행한다.
			else i++;
		}
		
		System.out.println(String.join("\n", factor));
	}

}