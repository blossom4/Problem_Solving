package q4344_������Ѱ���;

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
			
			// �л����� ������ ������ ArrayList�� �߰��ϸ鼭 ���Ѵ�.
			for (int j = 0; j < studentNumber; j++) {
				int studentScore = input.nextInt();
				scores.add(studentScore);
				sum += studentScore;
			}
		
			// ��������� ���Ѵ�.
			average = sum / studentNumber;
			
			// ��������� �Ѵ� �л��� ���� ���Ѵ�.
			for (int j = 0; j < studentNumber; j++) {
				if (scores.get(j) > average) count++;
			}

			// ��������� �Ѵ� �л��� ������ ���Ѵ�.
			result = (float)count / (float)studentNumber * 100;
			
			// �Ҽ��� ��°�ڸ����� ����ϰ� ArrayList�� �ʱ�ȭ�Ѵ�.
			System.out.println(String.format("%.3f", result) + "%");
			scores.removeAll(scores);		
		}
		
	}

}
