package com.sist.eaxm03;
import java.util.Scanner;

public class StringPractice02 {
	public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	String passward1;
	String passward2;
	
	System.out.println("��ȣ�� �Է��ϼ���");
	passward1 = sc.next();
	System.out.println("��ȣȮ���� �Է��ϼ���");
	passward2 = sc.next();
	
	if(passward1.equals(passward2) && passward1.length() >=8 && passward1.length() <=12) {
			System.out.println("�ùٸ� ��ȣ �Դϴ�");
	}else {
		System.out.println("��ȣ�� ���̸� 8���̻� 12�����Ϸ� ������ּ���!");
	}
	
	}
}
