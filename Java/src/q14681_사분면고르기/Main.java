package q14681_사분면고르기;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int quadrant;
		
		if (x > 0 && y > 0) quadrant = 1;
		else if (x < 0 && y > 0) quadrant = 2;
		else if (x < 0 && y < 0) quadrant = 3;
		else quadrant = 4;
		
		System.out.println(quadrant);
	}

}
