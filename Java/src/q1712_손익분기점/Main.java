package q1712_손익분기점;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int tempB = B;
		int C = Integer.parseInt(input[2]);
		int tempC = C;
		int count = 1;
		
		// 손익분기점을 넘기기 전까지 반복한다.
		while (C < (A + B)) {
			// 애초에 생산비용이 판매비용보다 크다면 손익분기점을 넘길 수 없으므로 break
			if (B > C) {
				count = -1;
				break;
			}
			
			B += tempB;
			C += tempC;
			count++;
		}
		
		if (count == -1) System.out.println(count);
		else System.out.println(count + 1);
	}

}
