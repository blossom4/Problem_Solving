package q1085_직사각형에서탈출;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		int w = Integer.parseInt(input[2]);
		int h = Integer.parseInt(input[3]);
		// 경계까지의 네 방향 거리를 arr 배열에 저장한다.
		int[] arr = {x, y, (w - x), (h - y)};

		// 오름차순으로 정렬하면 0번 째 index의 요소가 최소값이다.
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}

}