package q4344_평균은넘겠지;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<Integer>();
		int N = input.nextInt();
		
		for (int i = 0; i < N; i++) {
			int studentNumber = input.nextInt();
			int sum = 0;
			int count = 0;
			float average = 0;
			float result = 0;
			
			// 학생들의 점수의 총합을 ArrayList에 추가하면서 더한다.
			for (int j = 0; j < studentNumber; j++) {
				int studentScore = input.nextInt();
				scores.add(studentScore);
				sum += studentScore;
			}
		
			// 평균점수를 구한다.
			average = sum / studentNumber;
			
			// 평균점수를 넘는 학생의 수를 구한다.
			for (int j = 0; j < studentNumber; j++) {
				if (scores.get(j) > average) count++;
			}

			// 평균점수를 넘는 학생의 비율을 구한다.
			result = (float)count / (float)studentNumber * 100;
			
			// 소수점 셋째자리까지 출력하고 ArrayList를 초기화한다.
			System.out.println(String.format("%.3f", result) + "%");
			scores.removeAll(scores);		
		}
		
	}

}
