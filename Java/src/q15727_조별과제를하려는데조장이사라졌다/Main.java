package q15727_조별과제를하려는데조장이사라졌다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		
		if (L % 5 == 0) System.out.println(L / 5);
		else System.out.println(L / 5 + 1);
	}

}
