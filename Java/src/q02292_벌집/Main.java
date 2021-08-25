package q02292_벌집;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int layer = 1;
		int start = 1;
		
		while (start < N) {
			start += 6 * layer;
			layer++;
		}
		
		System.out.println(layer);
	}

}
