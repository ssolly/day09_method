package day09_method;

import java.util.Scanner;

public class Ex03_Method {

	public void sumFunc() {
		Scanner sc = new Scanner(System.in);
		int num1,num2,sum;
		
		System.out.print("ù��° ���� �Է� : ");
		num1=sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		num2=sc.nextInt();
		
		sum=num1+num2;
		System.out.println("�� ���� �� : " + sum);
		
	}
}
