//���ο����� �ݳ����� 40�� �̻��� ����鿡�� ���� �ϰ��� �ǽ�
//�ϰ��� ����ڴ� 40�� �̻��̰� ���ذ� ¦�������̸� ¦�������� �¾ ���
//���ذ� Ȧ�������̸� Ȧ�������� �¾ ����� ����ϰ��� �����

import java.util.Scanner;
import java.util.Date;
class CancerTest04{
public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   Date today = new Date();
   String name;
   int userYear;
   int thisYear = today.getYear()+1900;
   System.out.println("�̸��� �Է��ϼ���");
   name = sc.next();
   System.out.println("����⵵�� �Է��ϼ���");
   userYear = sc.nextInt();
   int age = thisYear - userYear;
   if(thisYear % 2 == userYear % 2 && age>=40)
   System.out.println(name +"��," +thisYear+"�⵵�� ���� �ϰ��� ������Դϴ�");
   else
   System.out.println(name +"��," +thisYear+"�⵵�� ���� �ϰ��� ����ڰ� �ƴմϴ�");
  }
}