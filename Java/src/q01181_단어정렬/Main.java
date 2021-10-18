package q01181_단어정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<String>[] arr = new ArrayList[51];
		
		for (int i = 0; i < 51; i++) {
			arr[i] = new ArrayList<String>();
		}
		
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			
			if (!arr[input.length()].contains(input)) {
				arr[input.length()].add(input);
			}
			
		}
		
		for (int i = 0; i < 51; i++) {
			if (arr[i].size() != 0) {
				Collections.sort(arr[i]);
				
				for (int j = 0; j < arr[i].size(); j++) {
					System.out.println(arr[i].get(j));
				}
			}
			
		}
				
	}
}
