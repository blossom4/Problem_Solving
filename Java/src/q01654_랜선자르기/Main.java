package q01654_랜선자르기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static String[] input;
	public static int K, N;
	public static int[] cables;
	public static double[] mods;

	public static void main(String[] args) throws IOException{
		input = br.readLine().split(" ");
		K = Integer.parseInt(input[0]);
		N = Integer.parseInt(input[1]);
		cables = new int[K];
		mods = new double[K];
		
		long minLength = 0;
		long midLength = 0;
		long maxLength = Integer.MIN_VALUE;
		
		for (int i = 0; i < K; i++) {
			cables[i] = Integer.parseInt(br.readLine());
			
			if (maxLength < cables[i]) maxLength = cables[i];
		}
		
		maxLength++;
		
		while (minLength < maxLength) {
			
			midLength = (minLength + maxLength) / 2;
			
			long count = 0;
			
			for (int i = 0; i < cables.length; i++) {
				count += cables[i] / midLength;
			}
			
			if (count < N) maxLength = midLength;
			else minLength = midLength + 1;
		}
		
		System.out.println(minLength - 1);
	}

}
