package q5554_심부름가는길;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		
		// 총 몇초가 걸리는지 구하기위해 입력된 값을 모두 더한다.
		for (int i = 0; i < 4; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		
		// minutes
		System.out.println(sum / 60);
		// seconds
		System.out.println(sum - (sum / 60) * 60);
	}

}