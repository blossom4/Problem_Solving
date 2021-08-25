package q1002_�ͷ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	// �� ��ǥ (x1, y1) �� (x2, y2) ������ �Ÿ��� ���ϴ� �Լ�
	public static double getDistance(int x1, int y1, int x2, int y2) {
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		return distance;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		ArrayList<String> results = new ArrayList<String>();
	
		for (int tc = 0; tc < T; tc++) {
			String[] input = br.readLine().split(" ");
			int x1 = Integer.parseInt(input[0]);
			int y1 = Integer.parseInt(input[1]);
			int r1 = Integer.parseInt(input[2]);
			int x2 = Integer.parseInt(input[3]);
			int y2 = Integer.parseInt(input[4]);
			int r2 = Integer.parseInt(input[5]);
			
			// �ΰ��� ���� ���� ���
			if (x1 == x2 && y1 == y2 && r1 == r2) results.add("-1");
			// �־ �ȸ����� ���
			else if (getDistance(x1, y1, x2, y2) > r1 + r2) results.add("0");
			// ū ���� ���ο� ���� ���� ���־ �ȸ����� ���
			else if (getDistance(x1, y1, x2, y2) < Math.abs(r1 - r2)) results.add("0");
			// ������ ���
			else if (getDistance(x1, y1, x2, y2) == r1 + r2) results.add("1");
			// ������ ���
			else if (getDistance(x1, y1, x2, y2) == Math.abs(r1 - r2)) results.add("1");
			else results.add("2");
		}

		System.out.println(String.join("\n", results));
	}

}
