package init;

import java.util.Scanner;

public class NumberDemo {

	public static void main(String[] args) {

			Scanner in = new Scanner(System.in);
			int  a,b ,total;
			System.out.println("Number 1");
			a = in.nextInt();
			System.out.println("Number 2");
			b = in.nextInt();
			
			total = a + b;
			
			System.out.println("total "+total);
			
	}

}
