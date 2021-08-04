package day09_method;

import java.util.Scanner;

public class Ex07_Method {

	public void reverse() {
		Scanner sc = new Scanner(System.in);
		int num=0, temp=0;
		System.out.print("¼ö ÀÔ·Â : ");
		num = sc.nextInt();
		
		while(true) {
			temp = num%10;
			num=num/10;
			System.out.println(temp + " ");
			if(num==0) {
				break;
			}
		}
	}
}
