package day09_method;

public class Ex05_Method {

	public int sumFunc(int n1,int n2) {
		int sum=n1+n2;
		return sum;
	}
	
	public void test(int n) {
		if (n==1) {
			System.out.println("if");
		} else {
			System.out.println("else");
			return;			//해당 메소드를 종료하는 기능
		}
		System.out.println("test 메소드 종료");
	}
	
	public String test02() {
		return "안녕하세요";
	}
	
	public String test03() {
		int num=1;
		if (num==1) {
			return "return null이 없다면 에러발생 : int가 num이 아닐 수 있기 때문";
		}
		return null;
	}
}
