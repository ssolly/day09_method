package day09_method;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		/*
		 # ��� ������ ������ ��ɺ��� ����� ǥ���Ͻÿ�
		  (�Է��� main, ���� ����� ������� �����Ͻÿ�)
		*/
			Quiz01_Method qm = new Quiz01_Method();
		
		// ���� ���
			int num1 = qm.askNumber();
			int num2 = qm.askNumber();
			
		// 1. �� ���� �Է� �޾� ū ���� ����ϴ� �Լ��� ����ÿ�
			System.out.println("�� ���� �� �� �� ū �� : " + qm.compareNumber(num1, num2));
		
		// 2. �Է� ���� ���� ¦������ Ȧ������ �Ǻ��ϴ� �Լ� ����
			System.out.println(num1+"�� "+qm.oddeven(num1)+"�Դϴ�");
			
		// 3. 3�� ����� �Ǻ��ϴ� �Լ��� ����� �� �Լ��� �̿��Ͽ� main���� 3�� ����� ����Ͻÿ�
			System.out.println(num1+"�� 3�� ����ΰ�? " + qm.times3(num1));
			
		// 4. ���� �Է� �޾� �Ҽ��� �Ǻ��ϴ� �Լ� ����
			System.out.println(num1+"�� �Ҽ��ΰ�? " + qm.primeNumber(num1));
			
		// 5. ���밪�� ���ϴ� �Լ��� �����Ͻÿ�
			int num3 = qm.askNumber();
			System.out.println(num3+"�� ���밪 : "+qm.absoluteValue(num3));
		
		// 6. ������ �Ųٷ� ���� ��ȯ�ϴ� �޼ҵ带, ������ ��ɺ��� ����ÿ� 
			System.out.print(num1 + " : ");
			qm.reverse(num1);
	}
}
