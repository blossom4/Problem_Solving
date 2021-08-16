package q10699_오늘날짜;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
//		Date today = new Date();
//		System.out.println(today);
		
//		Mon Aug 16 20:44:35 KST 2021
		
		SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sDate.format(new Date()));
	}

}
