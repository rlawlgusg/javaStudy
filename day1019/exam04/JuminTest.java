package com.sist.exam04;
import java.util.Scanner;
public class JuminTest {
//���� ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jumin = "111111-1111111";
		int sum = 0;

		int []arr = {2,3,4,5,6,7,8,9,2,3,4,5};//12�ڸ�
		int []juminarr = new int [13]; //���� �ֹι�ȣ ���ڸ��ӻ�����
		Scanner sc = new Scanner(System.in);
		System.out.println("-�� �����Ͽ� �ֹι�ȣ�� �Է��ϼ���");
		jumin = sc.next();
		
		if(jumin.length() != 14) {
			System.out.println("�ֹι�ȣ�� �ڸ����� Ʋ�Ƚ��ϴ�");
		}else {
			if(jumin.charAt(7)=='1' || jumin.charAt(7) =='2' || jumin.charAt(7) =='3'|| jumin.charAt(7) =='4') {
				for(int i=0;i<juminarr.length-1;i++) {
					jumin = jumin.replace("-", ""); //replace ��ü 
					jumin.trim();
					juminarr[i] = Integer.parseInt((jumin).substring(i));
					sum += juminarr[i]*arr[i];
				}
				juminarr[12] = 11-(sum%11);
				if(juminarr[12] == (11-(sum%11))%10) { //10�� 0, 11�� 1��ǥ��
					System.out.println("������ �ֹι�ȣ�Դϴ�!!!!!!!!!!!!!!");
				}else {
					System.out.println("������ �ֹι�ȣ");
				}			
			}else {
				System.out.println("�߸��� �ֹι�ȣ �Դϴ�");
			}
		}
		
		
		
	
		
		
		
	}

}
