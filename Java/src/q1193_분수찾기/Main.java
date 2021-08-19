package q1193_분수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int n = 1;
		int i = 1;
		int tempN = 0;
		int tempI = 0;
		while (n <= X) {
			tempN = n;
			tempI = i;
			n += i;
			i++;
		}
		
		if (tempI % 2 == 0)	System.out.println((1 + X - tempN) + "/" + (tempI - X + tempN));
		else System.out.println((tempI - X + tempN) + "/" + (1 + X - tempN));
	}
}
