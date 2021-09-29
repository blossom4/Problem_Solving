package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	
	public static String isEvenNumber (int n) {
		System.out.println("isEnvenNumber함수 실행 시작");
		System.out.println();
		if (n % 2 == 0) {
			return "짝수";
		} else {
			return  "홀수";
		}
		
	}
	
	public static String test (int a) {
		System.out.println("얘는 깎두기임 ㅇㅇ");
		return "asdf";
	}
	

	
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = "";
		
		int N = Integer.parseInt(br.readLine());
		System.out.println("얘가 먼저임 ㅇㅇ");
		bw.write(isEvenNumber(N));

		bw.write(test(1));
		
		int n = Integer.MAX_VALUE;
		System.out.println(n);
		
		bw.flush();
		bw.close(); 
	}
}
