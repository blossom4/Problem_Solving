package q3009_�׹�°��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] xArr = new String[3];
		String[] yArr = new String[3];
		String x = "";
		String y = "";
		
		// �� ��ǥ�� x, y���� ���� �ٸ� �迭�� �����Ѵ�.
		for (int i = 0; i < 3; i++) {
			String[] input = br.readLine().split(" ");
			xArr[i] = input[0];
			yArr[i] = input[1];
		}
		
		// ���� x��ǥ�� �� ���� �־�� ���簢���� �ǹǷ� �ϳ��� �ִ� ���� String x�� �ִ´�.
		if (xArr[0].equals(xArr[1])) x += xArr[2];
		else if (xArr[0].equals(xArr[2])) x += xArr[1];
		else x += xArr[0];
		
		// ���� ����ǥ�� �� ���� �־�� ���簢���� �ǹǷ� �ϳ��� �ִ� ���� String �˿� �ִ´�.
		if (yArr[0].equals(yArr[1])) y += yArr[2];
		else if (yArr[0].equals(yArr[2])) y += yArr[1];
		else y += yArr[0];
		
		System.out.println(x + " " + y);
	}

}
