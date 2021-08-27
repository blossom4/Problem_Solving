package q01297_TV크기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int D = Integer.parseInt(input[0]);
		int H = Integer.parseInt(input[1]);
		int W = Integer.parseInt(input[2]);
		
		// 대각선 길이로부터 높이와 너비가 실제와 몇대몇 비율인지 구한다.
		double ratio = Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2));	
		// 실제 높이
		double realH = Math.sqrt(ratio * Math.pow(H, 2));
		// 실제 너비
		double realW = Math.sqrt(ratio * Math.pow(W, 2));
		
		System.out.println((int)realH);
		System.out.println((int)realW);
	}

}
