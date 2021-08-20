package q2839_�������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int five = N / 5;
		int three = 0;
		int result = -1;
		
		// N�� 5�� ������ �������� ���� �ּҺ��� �� �̴�. 
		if (N % 5 == 0) result = five;
		else {
			// 5kg���� ���� �ϳ��� �ٿ����鼭 3kg������ ���ؼ� ������ Ȯ���Ѵ�.
			while (five >= 0) {
				// 5kg���� ���� 3kg���� ���� N���� ������ 5kg������ �ϳ��� ���鼭 3kg ������ ������ ������ ���Ѵ�.
				// �� �� ���� 3kg������ ���ϴٰ� N�� �Ѿ�� �Ұ����� ����� �� �̹Ƿ� 5kg������ �ϳ� �� ���� �˻縦 �ݺ��Ѵ�.
				while ((five * 5 + three * 3) < N) {
					if ((five * 5 + three * 3) == N) {
						three++;
						break;
					}
					three++;
				}
				
				// N�� �������� ���� ������ ���� ���� ���ؼ� result�� �����ϰ� break;
				if ((five * 5 + three * 3) == N) {
					result = five + three;
					break;
				}
				
				// �ѹ��� N�� ���� ���̾�� result�� ���� ���������� ���ٸ� ������ -1�� �״�� ������ �ȴ�.
				five--;		
			}
		}
		
		System.out.println(result);
	}

}
