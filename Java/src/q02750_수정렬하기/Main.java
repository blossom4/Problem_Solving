package q02750_수정렬하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		// 받은 입력을 배열에 저장한다.
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 오름차순으로 정렬한다.
		Arrays.sort(arr);
		
		// print
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
	}

}