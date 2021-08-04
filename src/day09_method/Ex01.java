package day09_method;

import java.util.Scanner;

public class Ex01 {

	/*
	 # class
	  - 사용자 정의 자료형(사용자가 만들고 싶은데로 만들어 사용하는 자료형)
	  - 재사용 가능
	 # 객체
	  - 변수를 객체라고 부른다 (현재까지의 사용하는 우리의 의미)
	  - class 자료형으로 변수를 만드는 것
	 # 메소드(method)
	  - 기능을 말한다 (보통 소괄호()가 있으면 기능이라고 보면 된다)
	  - 보편적으로 메소드 또는 함수라고 말한다
	  - 메소드는 클래스 내부에서 정의하는 것을 말한다
	  - 함수는 클래스 없이 독립적으로 사용하는 것 
	 # 접근제한자
	  - public : 외부, 내부의 접근을 허용한다
	  - private : 외부의 접근을 막는다. 내부에서만 허용한다
	  - protected : 상속 받은 자식
	  - default : 접근제한자無, 동일한 패키지에서만 접근 가능
	 */
	
	public static void main(String[] args) {
		
		//String name, addr, phNum,birth;
		//int age, stNum;
		
		Ex01_Class ex = new Ex01_Class();	// 클래스 자료형의 객체
		
		// 멤버 접근 연산자
		//ex="홍길동";  - 문제有 : 문자열이 어디에 들어가야하는지 명시해놓은 바가 없다
		ex.name="홍길동";
		//ex.age = 27; - 문제有 : Ex01_Class에서 age변수는 private 제한자를 갖고 있다
		System.out.println(ex.name);
		
	}
}
