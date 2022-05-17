package lab;

import java.util.Scanner;

public class work3 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in)) {
			int b =a.nextInt();
			int c=10;
			   while (b!=0) {
				   b--;
				   if (b%10==0)
					   System.out.println(b);
				   
			   }
		}
	}

}
