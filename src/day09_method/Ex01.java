package day09_method;

import java.util.Scanner;

public class Ex01 {

	/*
	 # class
	  - ����� ���� �ڷ���(����ڰ� ����� �������� ����� ����ϴ� �ڷ���)
	  - ���� ����
	 # ��ü
	  - ������ ��ü��� �θ��� (��������� ����ϴ� �츮�� �ǹ�)
	  - class �ڷ������� ������ ����� ��
	 # �޼ҵ�(method)
	  - ����� ���Ѵ� (���� �Ұ�ȣ()�� ������ ����̶�� ���� �ȴ�)
	  - ���������� �޼ҵ� �Ǵ� �Լ���� ���Ѵ�
	  - �޼ҵ�� Ŭ���� ���ο��� �����ϴ� ���� ���Ѵ�
	  - �Լ��� Ŭ���� ���� ���������� ����ϴ� �� 
	 */
	
	public static void main(String[] args) {
		
		//String name, addr, phNum,birth;
		//int age, stNum;
		
		Ex01_Class ex = new Ex01_Class();	// Ŭ���� �ڷ����� ��ü
		
		// ��� ���� ������
		//ex="ȫ�浿";  - ������ : ���ڿ��� ��� �����ϴ��� ����س��� �ٰ� ����
		ex.name="ȫ�浿";
		System.out.println(ex.name);
		
	}
}
