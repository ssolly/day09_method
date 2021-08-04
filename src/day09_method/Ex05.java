package day09_method;

public class Ex05 {

	public static void main(String[] args) {
		
		Ex05_Method ex = new Ex05_Method();
		int sum = ex.sumFunc(23,245);
		System.out.println("รัวี : " + sum);
		ex.test(7);
		ex.test02();
		String str = ex.test02();
		System.out.println(str);
		System.out.println(ex.test02());
		
	}
}
