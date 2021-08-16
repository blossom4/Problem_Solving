package q3046_R2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int R1 = Integer.parseInt(input[0]);
		int S = Integer.parseInt(input[1]);
		int R2 = S * 2 - R1;
		
		System.out.println(R2);
	}

}
