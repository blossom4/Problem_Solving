package q02530_인공지능시계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] time = br.readLine().split(" ");
		int H = Integer.parseInt(time[0]);
		int M = Integer.parseInt(time[1]);
		int S = Integer.parseInt(time[2]);
		int cookTime = Integer.parseInt(br.readLine());
		// 오븐작동에 걸리는 일(day)
		int cookD =  cookTime / 86400;
		// 오븐작동에 걸리는 시(hour)
		int cookH = (cookTime - cookD * 86400) / 3600;
		// 오븐작동에 걸리는 분(minutes)
		int cookM = (cookTime - cookD * 86400 - cookH * 3600) / 60;
		// 오븐작동에 걸리는 초(seconds)
		int cookS = cookTime % 60;
		
		// 단위가 넘어갈 경우와 안넘어갈 경우를 시, 분, 초로 각각 구분해서 처리한다.
		if ((S + cookS) > 59) {
			S += cookS - 60;
			M += 1;
		} else S += cookS;
		
		if ((M + cookM) > 59) {
			M += cookM - 60;
			H += 1;
		} else M += cookM;
		
		if ((H + cookH) > 23) H += cookH - 24;
		else H += cookH;
		
		
		System.out.println(H + " " + M + " " + S);		
	}

}

