package q13305_주유소;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int N;
	public static String[] input;
	public static long[] distance;
	public static long[] gasPrice;
	public static long total;
	public static long minPrice;
	public static long acc;
	public static long temp;
	
	public static void main(String[] args) throws IOException {

		N = Integer.parseInt(br.readLine());
		distance = new long[N - 1];
		gasPrice = new long[N];
		total = 0;
		minPrice = Long.MAX_VALUE;
		acc = 0;
		temp = 0;
		
		input = br.readLine().split(" ");
		for (int i = 0; i < N - 1; i++) {
			distance[i] = Long.parseLong(input[i]);
		}
		
		// N - 1 까지만 고려해서 최소 기름값을 구하면된다. 마지막 주유소는 언제나 이용하지 않기 때문이다.
		input = br.readLine().split(" ");
		for (int i = 0; i < N - 1; i++) {
			gasPrice[i] = Long.parseLong(input[i]);
			
			if (gasPrice[i] < minPrice) minPrice = gasPrice[i];
		}

		int i = 0;
		temp = gasPrice[0];
		while (i < N) {
		
			// 현재 주유소가 최소값 주유소면 남은 모든 거리는 현재 주유소에서 기름을 채우고간다.
			if (gasPrice[i] == minPrice) {
				for (int j = i; j < N - 1; j++) {
					total += minPrice * distance[j];
				}
				
				break;
			}
			
			// 1. acc에 앞으로 가야하는 거리를 누적하고,
			// 2. 현재까지의 최소 기름값보다 다음 주유소의 가격이 같거나 비싸면 그냥 지나친다.
			// 3. 다음 주유소가 더 싸다면 지금까지 누적한 거리를 그동안 가장 쌌던 주유소 가격으로 계산해서 더하고, 
			//	  현재까지의 최소 기름값과 누적거리를 갱신한다.
			acc += distance[i];
			if (temp <= gasPrice[i + 1]) {
				i++;
				continue;
			} else {
				if(gasPrice[i] < temp) temp = gasPrice[i];
				total += temp * acc;
				acc = 0;
			}
			

			i++;
		}
		
		System.out.println(total);
	}

}
