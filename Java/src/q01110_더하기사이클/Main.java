package q01110_더하기사이클;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		// 기존의 N과 같아지는지 계속확인해야하므로 초기의 N값을 임시저장
		int temp = N;
		int count = 1;
		
		// 처음 한번 사이클 실행 후 N == temp라면 더이상 사이클을 돌릴필요없으므로 count 출력
		if (N < 10) N *= 11;
		else N = (N % 10) * 10 + (N / 10 + N % 10) % 10;
		
		// 값이 달라졌다면 같이질때까지 반복하며 count +1
		while (N != temp) {
			if (N < 10) N *= 11;
			else N = (N % 10) * 10 + (N / 10 + N % 10) % 10;
			
			count++;
		}
		
		System.out.println(count);

	}

}