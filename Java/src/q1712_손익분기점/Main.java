package q1712_���ͺб���;

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
		
		// ���ͺб����� �ѱ�� ������ �ݺ��Ѵ�.
		while (C < (A + B)) {
			// ���ʿ� �������� �Ǹź�뺸�� ũ�ٸ� ���ͺб����� �ѱ� �� �����Ƿ� break
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
