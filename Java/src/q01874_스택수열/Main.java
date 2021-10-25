package q01874_스택수열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static ArrayList<Integer> numbers;
	public static ArrayList<String> results;
	public static String line = "";
	public static int N;
	public static int start;
	public static int value;

	public static void main(String[] args) throws IOException{
		
		N = Integer.parseInt(br.readLine());
		numbers = new ArrayList<Integer>();
		results = new ArrayList<String>();
		start = 0;
		
		for (int j = 0; j < N; j++) {			
			value = Integer.parseInt(br.readLine());
			if (value > start) {
				for (int i = start + 1; i < value + 1; i++) {
					numbers.add(i);
					results.add("+\n");
					//bw.write(line + "+" + "\n");
				}
				
				start = value;
			} else if (numbers.get(numbers.size() - 1) != value) {
				System.out.println("NO");
				System.exit(0);
			}
			
			numbers.remove(numbers.get(numbers.size() - 1));
			results.add("-\n");
			//bw.write(line + "-" + "\n");
		
		}
		
		for (int i = 0; i < results.size(); i++) {
			bw.write(line + results.get(i));
		}

		bw.flush();
		bw.close();
	}

}
