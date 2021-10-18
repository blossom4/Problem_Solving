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
	public static ArrayList<Integer> input;
	public static ArrayList<Integer> numbers;
	public static String line = "";
	public static int N;

	public static void main(String[] args) throws IOException{
		
		N = Integer.parseInt(br.readLine());
		input = new ArrayList<Integer>();
		numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			input.add(Integer.parseInt(br.readLine()));
			numbers.add(i + 1);
			
		}
		
		System.out.println(input);
		System.out.println(numbers);
	}

}
