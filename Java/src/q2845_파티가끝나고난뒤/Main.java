package q2845_파티가끝나고난뒤;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// BuggeredReader를 사용하면 메모리적으로 훨씬 성능이 좋다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력값을 split하여 배열에 넣는다.
		String[] LP = br.readLine().split(" ");
		int peopleNum = Integer.parseInt(LP[0]) * Integer.parseInt(LP[1]);

		String[] newspaper = br.readLine().split(" ");
		String[] result = new String[5];
		
		// 각각의 차이를 result 배열에 넣고 join하여 출력한다.
		for (int i = 0; i < 5; i++) {
			result[i] = Integer.toString((Integer.parseInt(newspaper[i])) - peopleNum);
		}
		
		System.out.println(String.join(" ", result));
	}

}
