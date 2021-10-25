package q01920_수찾기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static int N;
	public static int M;
	public static String line = "";
	public static String[] inputN;
	public static String[] inputM;
	public static int[] arrayN;
	public static int temp;

	public static void main(String[] args) throws IOException {

		N = Integer.parseInt(br.readLine());
		arrayN = new int[N];
		inputN = br.readLine().split(" ");

		for (int i = 0; i < N; i++) {
			arrayN[i] = Integer.parseInt(inputN[i]);
		}
		
		Arrays.sort(arrayN);
		
		M = Integer.parseInt(br.readLine()); 
		inputM = br.readLine().split(" ");
		 
		for (int i = 0; i < M; i++) { 
			temp = Integer.parseInt(inputM[i]);
		 
			if (Arrays.binarySearch(arrayN, temp) >= 0) { 
				bw.write(line + "1\n"); 
			} else {
				bw.write(line +"0\n"); 
			} 
		}
		  
		bw.flush(); 
		bw.close();
		 
	}

}
