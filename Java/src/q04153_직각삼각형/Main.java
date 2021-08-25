package q04153_직각삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> results = new ArrayList<String>();
		
		while (true) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int c = Integer.parseInt(input[2]);
			int[] arr = {a, b, c};
			// 0 0 0 값이 들어오면 반복문을 종료한다.
			if (a == 0 && b == 0 && c == 0) break;
			
			Arrays.sort(arr);
			// 피타고라스의 정리로 조건을 검사합ㄴ다.
			if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) ==  Math.pow(arr[2], 2)) {
				results.add("right");
			} else {
				results.add("wrong");
			}
		}
		
		System.out.println(String.join("\n", results));
	}

}