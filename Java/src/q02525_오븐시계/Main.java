package q02525_오븐시계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] time = br.readLine().split(" ");
		int H = Integer.parseInt(time[0]);
		int M = Integer.parseInt(time[1]);
		int cookTime = Integer.parseInt(br.readLine());
		// 오븐작동에 걸리는 시(hour)
		int cookH = cookTime / 60;
		// 오븐작동에 걸리는 분(minutes)
		int cookM = cookTime % 60;
		
		// 단위가 넘어갈 경우와 안넘어갈 경우를 시, 분으로 각각 구분해서 처리한다.
		if ((M + cookM) > 59) {
			M += cookM - 60;
			H += 1;
		} else M += cookM;
		
		if ((H + cookH) > 23) H += cookH - 24;
		else H += cookH;
		
		
		System.out.println(H + " " + M);		
	}

}
