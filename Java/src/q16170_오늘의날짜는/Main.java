package q16170_오늘의날짜는;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat format = new SimpleDateFormat("yyyy\nMM\ndd");
		Date date = new Date();
				
		System.out.println(format.format(date));
	}
}
