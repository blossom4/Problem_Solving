package q2914_���۱�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Input A, I ���� ������ �迭
		String[] input_AI = br.readLine().split(" ");
		int A = Integer.parseInt(input_AI[0]);
		int I = Integer.parseInt(input_AI[1]);
		// A * (I - 1) + 1�� �ϸ� �ּҰ��� ���� �� �ִ�.
		int result = A * (I - 1) + 1;
		
		
		System.out.println(result);

	}

}
