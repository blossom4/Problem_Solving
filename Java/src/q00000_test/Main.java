package q00000_test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
		String s = "";   //출력할 문자열

		for (int i = 0; i < 10000; i++) {
			bw.write(s + "asdfasdf\n");   //버퍼에 있는 값 전부 출력

		}
		
		
		bw.flush();   //남아있는 데이터를 모두 출력시킴
		        
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
		System.out.println("시간차이(m) : "+secDiffTime);
		

		bw.close();   //스트림을 닫음
		
	}

}