package com.sist.eaxm03;
import java.util.Scanner;
public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email;
		int index;
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸����� �Է��Ͻÿ�");
		email = sc.next();
		
		if(email.indexOf('@') == -1) {
			System.out.println("�ùٸ� �̸����� �ƴմϴ�");
		}else{
			System.out.println("�ùٸ� �̸��� �Դϴ�");
		}
	}

}
