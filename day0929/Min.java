//�񱳿����� : �ΰ��� ���� ���� ���ϱ� ���� �����ڵ� < > <= >= == 
//ũ�ų� ������ �Ǻ��ϱ� ���ؼ��� ������� >��ȣ�� =�� �ٿ��� ����ϰ� �����ٲٸ� �ȉ� 
//�񱳿����� ����� boolean�ڷ����̴� 
//�񱳿����ڴ� ���� ��� ���ǽĿ� ���� ���۽��Ѿ� �� ������ �޶��� �� ����ϴ� ���ù��� ���ǽĿ��� ���
import java.util.Scanner;
class Min
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("ù��° ������ �Է��Ͻÿ�");
		a = sc.nextInt();
		System.out.println("�ι�° ������ �Է��Ͻÿ�");
		b = sc.nextInt();
		
		if(a>b)
	    System.out.println("���� ���� "+b);
		else
		System.out.println("���� ���� "+a);
	}
}
