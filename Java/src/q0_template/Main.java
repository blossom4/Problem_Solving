package q0_template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	// v: 현재속도, d: 도착지까지 남은 거리
	public static int brakeDistance (int v) {
		int sum = 0;
		
		for (int i = v; i > 0; i--) sum += i;
		
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc < T + 1; tc++) {
			String[] input = br.readLine().split(" ");
			int start = Integer.parseInt(input[0]);
			int end = Integer.parseInt(input[1]);
			
			
		}
	}

}