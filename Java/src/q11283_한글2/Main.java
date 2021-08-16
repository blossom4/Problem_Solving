package q11283_한글2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		char result = input.charAt(0);
		
		// 한글은 ascii code상에 44032부터  순서대로 저장되어있다.
		System.out.println(((int) result) - 44031);
	}

}
