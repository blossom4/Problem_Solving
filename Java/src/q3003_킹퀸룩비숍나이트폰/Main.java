package q3003_ŷ��������Ʈ��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ��� �ǽ��� �ִ� ��Ʈ�� �� ������ ������ �迭�� �����, 
		// ���� ���� ������ �޾� ���̸�ŭ missingNumbers �迭�� �����Ѵ�.
		int[] fullSet = {1, 1, 2, 2, 2, 8};
		String[] pieceNumbers = br.readLine().split(" ");
		String[] missingNumbers = new String[6];
		
		for (int i = 0; i < 6; i++) {
			missingNumbers[i] = Integer.toString((fullSet[i] - Integer.parseInt(pieceNumbers[i])));
		}
		
		System.out.println(String.join(" ", missingNumbers));		
	}

}
