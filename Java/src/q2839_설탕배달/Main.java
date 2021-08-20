package q2839_설탕배달;

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
		
		// N이 5로 나누어 떨어지면 몫이 최소봉지 수 이다. 
		if (N % 5 == 0) result = five;
		else {
			// 5kg봉지 수를 하나씩 줄여가면서 3kg봉지를 더해서 조건을 확인한다.
			while (five >= 0) {
				// 5kg봉지 수와 3kg봉지 수가 N보다 적으면 5kg봉지를 하나씩 빼면서 3kg 봉지를 같아질 때까지 더한다.
				// 이 때 만약 3kg봉지를 더하다가 N을 넘어서면 불가능한 경우의 수 이므로 5kg봉지를 하나 더 빼고 검사를 반복한다.
				while ((five * 5 + three * 3) < N) {
					if ((five * 5 + three * 3) == N) {
						three++;
						break;
					}
					three++;
				}
				
				// N과 같아졌을 때의 각각의 봉지 수를 더해서 result에 저장하고 break;
				if ((five * 5 + three * 3) == N) {
					result = five + three;
					break;
				}
				
				// 한번도 N과 같은 적이없어서 result의 값을 갱신한적이 없다면 기존값 -1이 그대로 나오게 된다.
				five--;		
			}
		}
		
		System.out.println(result);
	}

}
