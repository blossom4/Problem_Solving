package q10430_나머지;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		// JAVA에서는 입력을 받을 때 따로 공백처리를 해줄필요없이
		// 자동으로 공백을 기준으로 각각의 변수에 입력이된다.
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		
		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);
	}
}
