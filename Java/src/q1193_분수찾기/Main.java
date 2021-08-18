package q1193_분수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int i = 1;
		int n = 0;
		while (n <= X) {
			n += i;
			i++;
			System.out.println("i: " + i);
			System.out.println("n: " + n);
		}
		
		int a = 1;
		int b = i - 1;
		a += X - n - 1;
		b -= X - n - 1;
		
		System.out.println(a + "/" + b);

	}

}
