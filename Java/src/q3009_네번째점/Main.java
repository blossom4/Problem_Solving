package q3009_네번째점;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] xArr = new String[3];
		String[] yArr = new String[3];
		String x = "";
		String y = "";
		
		// 세 좌표의 x, y값을 각각 다른 배열에 저장한다.
		for (int i = 0; i < 3; i++) {
			String[] input = br.readLine().split(" ");
			xArr[i] = input[0];
			yArr[i] = input[1];
		}
		
		// 같은 x좌표가 두 개씩 있어야 직사각형이 되므로 하나만 있는 값을 String x에 넣는다.
		if (xArr[0].equals(xArr[1])) x += xArr[2];
		else if (xArr[0].equals(xArr[2])) x += xArr[1];
		else x += xArr[0];
		
		// 같은 ㅛ좌표가 두 개씩 있어야 직사각형이 되므로 하나만 있는 값을 String ㅛ에 넣는다.
		if (yArr[0].equals(yArr[1])) y += yArr[2];
		else if (yArr[0].equals(yArr[2])) y += yArr[1];
		else y += yArr[0];
		
		System.out.println(x + " " + y);
	}

}