package q02752_세수정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int[] numbers = new int[3];
		
		// 입력받은 문자열 숫자를 정수형으로 변환하여 배열에 저장한다.
		for (int i = 0; i < 3; i++) numbers[i] = Integer.parseInt(input[i]);
		
		// 오름차순으로 정렬한다.
		Arrays.sort(numbers);
		
		System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);;
	}

}
