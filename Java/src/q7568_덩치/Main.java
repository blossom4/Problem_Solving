package q7568_��ġ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] xArr = new int[N];
		int[] yArr = new int[N];
		int rank = 1;
		String[] results = new String[N];
		
		// �����Կ� Ű �迭�� ���� ���� N�� ��ŭ �Է��� �޴´�.
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			
			xArr[i] = x;
			yArr[i] = y;
		}
		
		// 2�� for���� ���鼭 �ڽź��� �����Կ� Ű ��� ũ�� rank +1�� �ؼ� ������ ���� ������ results �迭�� �����Ѵ�.
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (xArr[i] < xArr[j] && yArr[i] < yArr[j]) rank++;
			}
			
			results[i] = Integer.toString(rank);
			rank = 1;
		}
		
		System.out.println(String.join(" ", results));
	}

}
