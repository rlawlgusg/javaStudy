//��Ʈ������ �߿� ��Ʈ��(&)�� ��Ʈ��(|)�� �������ڷε� ����� �� �ִ�
import java.util.Scanner;
class Age
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age1;
		int age2;

		System.out.print("ù��° ����� ���̸� �Է��ϼ���");
		age1 = sc.nextInt();
		System.out.print("�ι�° ����� ���̸� �Է��ϼ���");
		age2 = sc.nextInt();

		if(age1>=20 & age2>=20) 
		System.out.println("�λ�� ��� �����Դϴ�");
		else
		System.out.println("�λ�� ��� 20�� �̻��� �ƴմϴ�");

	}
}
