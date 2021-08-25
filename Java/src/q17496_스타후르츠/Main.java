package q17496_스타후르츠;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int T = Integer.parseInt(input[1]);
		int C = Integer.parseInt(input[2]);
		int P = Integer.parseInt(input[3]);
		int total = 0;
		
		for (int i = 0; i < N; i++) {
			if (i != 0 && i % T == 0) total += C * P;
		}
		
		System.out.println(total);
	}

}
