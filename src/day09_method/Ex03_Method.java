package day09_method;

import java.util.Scanner;

public class Ex03_Method {

	public void sumFunc() {
		Scanner sc = new Scanner(System.in);
		int num1,num2,sum;
		
		System.out.print("첫번째 숫자 입력 : ");
		num1=sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		num2=sc.nextInt();
		
		sum=num1+num2;
		System.out.println("두 수의 합 : " + sum);
		
	}
}
