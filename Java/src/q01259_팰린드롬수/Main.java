package q01259_팰린드롬수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static String input;
	public static String line = "";
	
	public static void main(String[] args) throws IOException {
		
		while (true) {
			input = br.readLine();
			
			// 0을 입력받으면 지금까지의 결과를 모두 출력하고 종료한다.
			if (input.equals("0")) {
				bw.flush();
				bw.close();
				break;
			}
			
			// input의 길이가 1이면 무조건 팰린드롬수이다.
			if (input.length() == 1) {
				bw.write(line + "yes\n");
				continue;
			}
			
			for (int i = 0; i < input.length() / 2; i++) {
				// 앞에서부터 절반 길이까지만 검사하면서 대칭되는 index의 숫자가 다르면  no, 같으면 yes를 버퍼에 쓴다.
				if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
					bw.write(line + "no\n");
					break;
				}
				
				if (i == (input.length() / 2) - 1) bw.write(line + "yes\n");
			}
			
			
		}
	}
}
