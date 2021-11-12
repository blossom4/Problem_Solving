package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String answer = "";
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(participant));
		
		for (int i = 0; i < completion.length; i++) {
			for (int j = 0; j < list.size(); j++) {
				if (completion[i].equals(list.get(j))) {
					list.remove(j);
				}
			}
		}
		
		answer = list.get(0);
		System.out.println(answer);
	}
}
