/*
���׿�����(���ǽĿ�����)
(��1)?��2:��3
��1�� ���ǽ�
��1�� ���ǽ��� true�̸� ��2�� ����, false�̸� ��3�� �����Ѵ�
���� 3�� �־� ���׽Ŀ����ڶ�� �ϰ� �����ڿ� ���ǽ��� �ִ��Ͽ� ���ǽĿ����ڶ�� �Ѵ�
ª��(������) if else�� �ٿ����� ǥ��
����     int a = 5;
		int b = (a>0)?100:0;
		System.out.println(b);

		int data = 5;
		System.out.println((data>0)?"OK":"NO");
*/
import java.util.Scanner;
class MinTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("ù��° ������ �Է��ϼ���: ");
		a = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ���: ");
		b = sc.nextInt();
		System.out.println((a>b)?"���߿� �������� "+b+"�Դϴ�":"���߿� �������� "+a+"�Դϴ�");
		
	}
}
