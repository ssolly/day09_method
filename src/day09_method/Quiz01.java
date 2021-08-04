package day09_method;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		/*
		 # 모든 문제는 각각의 기능별로 만들어 표현하시오
		  (입력은 main, 연산 출력은 기능으로 구현하시오)
		*/
			Quiz01_Method qm = new Quiz01_Method();
		
		// 공통 사용
			int num1 = qm.askNumber();
			int num2 = qm.askNumber();
			
		// 1. 두 수를 입력 받아 큰 수를 출력하는 함수를 만드시오
			System.out.println("두 개의 수 중 더 큰 수 : " + qm.compareNumber(num1, num2));
		
		// 2. 입력 받은 값이 짝수인지 홀수인지 판별하는 함수 제작
			System.out.println(num1+"은 "+qm.oddeven(num1)+"입니다");
			
		// 3. 3의 배수를 판별하는 함수를 만들고 이 함수를 이용하여 main에서 3의 배수만 출력하시오
			System.out.println(num1+"은 3의 배수인가? " + qm.times3(num1));
			
		// 4. 수를 입력 받아 소수를 판별하는 함수 제작
			System.out.println(num1+"은 소수인가? " + qm.primeNumber(num1));
			
		// 5. 절대값을 구하는 함수를 정의하시오
			int num3 = qm.askNumber();
			System.out.println(num3+"의 절대값 : "+qm.absoluteValue(num3));
		
		// 6. 이전의 거꾸로 수를 반환하는 메소드를, 각각의 기능별로 만드시오 
			System.out.print(num1 + " : ");
			qm.reverse(num1);
	}
}
