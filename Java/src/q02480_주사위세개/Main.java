package q02480_주사위세개;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n1 = Integer.parseInt(input[0]);
		int n2 = Integer.parseInt(input[1]);
		int n3 = Integer.parseInt(input[2]);
		int[] numbers = {n1, n2, n3};
		// 같은 눈 주사위의 개수
		int sameDice = 1;
		// 같은 눈 주사위의 값
		int sameNumber = 1;
		// 총 상금
		int prizeMoney = 0;
		
		// 오름차순으로 정렬 후 주사위 눈의 값이 같다면 sameDice +1을 하고 sameNumber의 값을 갱신한다.
		Arrays.sort(numbers);
				
		for (int i = 0; i < 2; i++) {
			if (numbers[i] == numbers[i + 1]) {
				sameDice++;
				sameNumber = numbers[i + 1];
			}
		}
		
		// 같은 눈 주사위의 개수에 따라 다른 계산방법으로 최종상금을 구한다.
		if (sameDice == 1) prizeMoney = numbers[2] * 100;
		else if (sameDice == 2) prizeMoney = 1000 + sameNumber * 100;
		else if (sameDice == 3) prizeMoney = 10000 + sameNumber * 1000;
		
		System.out.println(prizeMoney);
	}

}
