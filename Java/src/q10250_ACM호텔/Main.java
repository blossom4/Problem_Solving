package q10250_ACMÈ£ÅÚ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] resultArr = new String[T];
		
		for (int i = 0; i < T; i++) {
			String[] input = br.readLine().split(" ");
			int H = Integer.parseInt(input[0]);
			int W = Integer.parseInt(input[1]);
			int N = Integer.parseInt(input[2]);
			int floor = N % H;
			int roomNumber = N / H + 1;
			String result = "";

			if (floor == 0) {
				if (roomNumber < 11) {
					result = Integer.toString(H) + "0" + Integer.toString(roomNumber - 1);
				}
				else result = Integer.toString(H) + Integer.toString(roomNumber - 1);
			} else {
				if (roomNumber < 10) {
					result = Integer.toString(floor) + "0" + Integer.toString(roomNumber);
				}
				else result = Integer.toString(floor) + Integer.toString(roomNumber);
			}
			
			
			resultArr[i] = result;
		}
		
		System.out.println(String.join(" ", resultArr));
	}

}
