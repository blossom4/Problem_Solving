package q14889_스타트와링크;

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
	public static String line = "";
	public static String[] input;
	public static String inputString;
	public static int[][] statusArr;
	public static int[] Start;
	public static int[] Link;
	public static boolean[] members;
	public static int minValue;
	public static int shorten;
	public static int cases = 1;
	
	// 오름차순 여부를 판별하는 함수
	public static boolean isAscending(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) return false;
		}
		
		return true;
	}
	
	public static void buildTeam() {
		int index = 0;
		for (int i = 1; i < N + 1; i++) {
			for (int j = 0; j < N / 2; j++) {
				if (i == Start[j]) break;
				if (j == N / 2 - 1) {
					Link[index] = i;
					index++;
				}
			}
		}
	}
	
	
	public static int getStatusValue(int[] arr) {
		
		int sum = 0;
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				
				sum += statusArr[arr[i] - 1][arr[j] - 1] + statusArr[arr[j] - 1][arr[i] - 1];
			}
		}
		
		
		return sum;
	}
	
	public static void btk(int n) throws IOException {
		
		if (n == N / 2) {

			if (shorten > cases) return;
			if (!isAscending(Start)) return;
			
			buildTeam();
			
			int StartValue = getStatusValue(Start);
			int LinkValue = getStatusValue(Link);
			if(Math.abs(StartValue - LinkValue) < minValue) minValue = Math.abs(StartValue - LinkValue);
			

			shorten++;
			return;
		}
		
		for (int i = 1; i < N + 1; i++) {
			if (members[i]) continue;
			
			members[i] = true;
			Start[n] = i;

			
			btk(n + 1);
			
			members[i] = false;
		}
	}
	
	public static void main(String[] args) throws IOException {

		N = Integer.parseInt(br.readLine());
		statusArr = new int[N][N];
		input = new String[N];
		minValue = ((N / 2) * ((N / 2) - 1) / 2) * 100;
		members = new boolean[N + 1];
		Start = new int[N / 2];
		Link = new int[N / 2];
		shorten = 0;
		
		for (int i = N; i > 1; i--) {
			if (i > N / 2) cases *= i;
			else cases /= i;
		}
		
		cases /= 2;
		
		for (int i = 0; i < N; i++) {
			input = br.readLine().split(" ");
			inputString = String.join("", input);

			for (int j = 0; j < N; j++) {
				statusArr[i][j] = inputString.charAt(j) - 48;
			}

		}
		
		btk(0);
		
		bw.write(line + minValue);
		bw.flush();
		bw.close(); 
		
	}

}
