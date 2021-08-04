package day09_method;

import java.util.Scanner;

public class Quiz01_Method {

	/*
	 # 모든 문제는 각각의 기능별로 만들어 표현하시오
	  (입력은 main, 연산 출력은 기능으로 구현하시오)
	*/
	// 0. 공통기능
		public int askNumber() {
			int num;
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자 입력 : ");
			num=sc.nextInt();
			return num;
		}
		
	// 1. 두 수를 입력 받아 큰 수를 출력하는 함수를 만드시오
		public int compareNumber(int num1,int num2) {
			if(num1>num2) {
				return num1;
			} else {
				return num2;
			}
		}
		
	// 2. 입력 받은 값이 짝수인지 홀수인지 판별하는 함수 제작
		public String oddeven(int num) {
			if(num%2==0) {
				return "짝수";
			} else {
				return "홀수";
			}
		}
			
	// 3. 3의 배수를 판별하는 함수를 만들고 이 함수를 이용하여 main에서 3의 배수만 출력하시오
		public boolean times3(int num) {
			if(num%3==0) {
				return true;
			} else {
				return false;
			}
		}
		
	// 4. 수를 입력 받아 소수를 판별하는 함수 제작
		public boolean primeNumber(int num) {
			int cnt=0;
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					cnt++;
				}
			}
			if (cnt==2) {
				return true;
			} else {
				return false;
			}
		}
		
	// 5. 절대값을 구하는 함수를 정의하시오
		public int absoluteValue(int num) {
			if(num>0) {
				return num;
			} else {
				return -num;
			}
		}
	// 6. 이전의 거꾸로 수를 반환하는 메소드를, 각각의 기능별로 만드시오
		public void reverse(int num) {
			int temp;
			while (true) {
				temp = num%10;
				num = num/10;
				System.out.print(temp + " ");
				if (num==0) {
					break;
				}
			}
		}
}
