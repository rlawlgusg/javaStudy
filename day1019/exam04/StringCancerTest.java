package com.sist.exam04;
import java.util.Scanner;
import java.util.Date;
public class StringCancerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
		   Date today = new Date();
		   String name;
		   String idnumber;
		   int thisYear = today.getYear()+1900;
		  
		   System.out.println("�̸��� �Է��ϼ���");
		   name = sc.next();
		   System.out.println("- �����Ͽ� �ֹε�Ϲ�ȣ�� �Է��ϼ���");
		   idnumber = sc.next();
		   int age = thisYear- (1900+ Integer.parseInt(idnumber.substring(0, 2))+1);
		   int userYear = 1900+ Integer.parseInt(idnumber.substring(0,2));
		  
		if(thisYear % 2 == userYear % 2 && age >= 40) {
			System.out.println(name +"��," +thisYear+"�⵵�� ���� �ϰ��� ������̸�");
				if(idnumber.charAt(7) == '1' && age<50) {
					if(age<50) {
					System.out.println("�����׸��� ����, �����Դϴ�.");
					}else if(age>=50) {
					System.out.println("�����׸��� ����, ����, ������Դϴ�");
					}	
				}
				if(idnumber.charAt(7) == '2') {
					if(age<50) {
					System.out.println("�����׸��� ����, ����, �����, �ڱþ� �Դϴ�.");
					}else if(age>=50) {
					System.out.println("�����׸��� ����, ����, �����, �����, �ڱþ� �Դϴ�");
				}
		}else {
			System.out.println(name + "���� ����ϰ��� ����ڰ� �ƴմϴ�.");
			}	  
		}
	}
}

