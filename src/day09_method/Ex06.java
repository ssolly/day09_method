package day09_method;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Ex06_Method ex = new Ex06_Method();
		ex.display();
		
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		
		System.out.print("�� �� �Է� : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		int sum = ex.test(n1,n2);
		ex.printSum(n1,n2,sum);
		
	}
}
