package q1085_���簢������Ż��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		int w = Integer.parseInt(input[2]);
		int h = Integer.parseInt(input[3]);
		// �������� �� ���� �Ÿ��� arr �迭�� �����Ѵ�.
		int[] arr = {x, y, (w - x), (h - y)};

		// ������������ �����ϸ� 0�� ° index�� ��Ұ� �ּҰ��̴�.
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}

}
