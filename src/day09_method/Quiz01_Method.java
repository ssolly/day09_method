package day09_method;

import java.util.Scanner;

public class Quiz01_Method {

	/*
	 # ��� ������ ������ ��ɺ��� ����� ǥ���Ͻÿ�
	  (�Է��� main, ���� ����� ������� �����Ͻÿ�)
	*/
	// 0. ������
		public int askNumber() {
			int num;
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �Է� : ");
			num=sc.nextInt();
			return num;
		}
		
	// 1. �� ���� �Է� �޾� ū ���� ����ϴ� �Լ��� ����ÿ�
		public int compareNumber(int num1,int num2) {
			if(num1>num2) {
				return num1;
			} else {
				return num2;
			}
		}
		
	// 2. �Է� ���� ���� ¦������ Ȧ������ �Ǻ��ϴ� �Լ� ����
		public String oddeven(int num) {
			if(num%2==0) {
				return "¦��";
			} else {
				return "Ȧ��";
			}
		}
			
	// 3. 3�� ����� �Ǻ��ϴ� �Լ��� ����� �� �Լ��� �̿��Ͽ� main���� 3�� ����� ����Ͻÿ�
		public boolean times3(int num) {
			if(num%3==0) {
				return true;
			} else {
				return false;
			}
		}
		
	// 4. ���� �Է� �޾� �Ҽ��� �Ǻ��ϴ� �Լ� ����
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
		
	// 5. ���밪�� ���ϴ� �Լ��� �����Ͻÿ�
		public int absoluteValue(int num) {
			if(num>0) {
				return num;
			} else {
				return -num;
			}
		}
	// 6. ������ �Ųٷ� ���� ��ȯ�ϴ� �޼ҵ带, ������ ��ɺ��� ����ÿ�
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
