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
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> results = new ArrayList<String>();

		for (int i = 0; i < N; i++) {
			String word = br.readLine();
			
			if (!words.contains(word)) words.add(word);			

		}
		Collections.sort(words);
		
		
		System.out.println(words);
	}
}
