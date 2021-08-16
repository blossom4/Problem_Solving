package q3003_킹퀸룩비숍나이트폰;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 모든 피스가 있는 세트의 각 개수를 저장한 배열을 만들고, 
		// 현재 가진 개수를 받아 차이만큼 missingNumbers 배열에 저장한다.
		int[] fullSet = {1, 1, 2, 2, 2, 8};
		String[] pieceNumbers = br.readLine().split(" ");
		String[] missingNumbers = new String[6];
		
		for (int i = 0; i < 6; i++) {
			missingNumbers[i] = Integer.toString((fullSet[i] - Integer.parseInt(pieceNumbers[i])));
		}
		
		System.out.println(String.join(" ", missingNumbers));		
	}

}
