package q2845_��Ƽ����������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// BuggeredReader�� ����ϸ� �޸������� �ξ� ������ ����.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �Է°��� split�Ͽ� �迭�� �ִ´�.
		String[] LP = br.readLine().split(" ");
		int peopleNum = Integer.parseInt(LP[0]) * Integer.parseInt(LP[1]);

		String[] newspaper = br.readLine().split(" ");
		String[] result = new String[5];
		
		// ������ ���̸� result �迭�� �ְ� join�Ͽ� ����Ѵ�.
		for (int i = 0; i < 5; i++) {
			result[i] = Integer.toString((Integer.parseInt(newspaper[i])) - peopleNum);
		}
		
		System.out.println(String.join(" ", result));
	}

}
