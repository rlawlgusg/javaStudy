package com.sist.exam04;
import java.util.Scanner;

import com.sist.eaxm03.Person;
public class StringTeamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email; 
		String text;
		String passward1;
		String passward2 = "1234567";
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ���");
		email = sc.next();
		
		System.out.println(email.substring(0,(email.indexOf('@'))));
		//
		System.out.println("������ ������ �Է��ϼ���");
		text = sc.next();
		int cnt = 0;
		for(int i=0 ; i<text.length() ; i++) {
			if(text.charAt(i) == 'o') {
					cnt++;
			}
		}
		System.out.println(cnt);
		
		System.out.println("���̵� �Է��ϼ���");
		email = sc.next();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		passward1 = sc.next();
		
		if(passward1.equals(passward2)) {
			System.out.println("�ùٸ� ��ȣ �Դϴ�");
		}else {
			System.out.println("��ȣ�� �ùٸ��� �ʽ��ϴ�");
		}
		
		
	}

}
//�� ���̵� ����
//������ ���� �Է¹޾� �ҹ��� o ����
//���̵�� ��й�ȣ �Է¹޾� �α������� ���α׷� �ۼ�
