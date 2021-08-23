package q20254_SiteScore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int U_R = Integer.parseInt(input[0]);
		int T_R = Integer.parseInt(input[1]);
		int U_O = Integer.parseInt(input[2]);
		int T_O = Integer.parseInt(input[3]);
		int result = 56 * U_R + 24 * T_R + 14 * U_O + 6 * T_O;
		
		System.out.println(result);
	}

}
