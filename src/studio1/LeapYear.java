package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input Year");
		int year = in.nextInt();
		int x = year%4;
		int y = year%100;
		int z = year%400;
		
		boolean leapYear = (x==0 && y!=0) || (z==0);
		System.out.print(leapYear);
	}

}
