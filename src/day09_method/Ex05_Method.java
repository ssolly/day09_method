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
			return;			//�ش� �޼ҵ带 �����ϴ� ���
		}
		System.out.println("test �޼ҵ� ����");
	}
	
	public String test02() {
		return "�ȳ��ϼ���";
	}
	
	public String test03() {
		int num=1;
		if (num==1) {
			return "return null�� ���ٸ� �����߻� : int�� num�� �ƴ� �� �ֱ� ����";
		}
		return null;
	}
}
