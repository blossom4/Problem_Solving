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
		int C = Integer.parseInt(input[2]);
		int count = 0;
		int profit = C - B;
		
		// ���ͺб����� �ѱ�� ������ �ݺ��Ѵ�.
		while (A >= 0) {
			// ���ʿ� �������� �Ǹź�뺸�� ���ų� ũ�ٸ� ���ͺб����� �ѱ� �� �����Ƿ� break
			if (profit <= 0) {
				count = -1;
				break;
			}
			A -= profit;
			count++;
		}
		
		System.out.println(count);
	}

}
