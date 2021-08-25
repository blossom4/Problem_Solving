package q03053_택시기하학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine());
		String result = "";
		
		// 유클리드 기하학에서 원의 넓이
		result += Math.PI * Math.pow(R, 2);
		result += "\n";
		// 택시 기하학에서 원의 넓이
		result += 2 * (Math.pow(R, 2));
		
		System.out.println(result);
	}

}