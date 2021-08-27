package q01181_단어정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<String>[] arr = new ArrayList[51];
		
		arr[1] = "AA";
		
//		for (int i = 0; i < 51; i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
