package q5554_�ɺθ����±�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		
		// �� ���ʰ� �ɸ����� ���ϱ����� �Էµ� ���� ��� ���Ѵ�.
		for (int i = 0; i < 4; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		
		// minutes
		System.out.println(sum / 60);
		// seconds
		System.out.println(sum - (sum / 60) * 60);
	}

}
