import java.util.Scanner;
class PlusFor
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum = 0;
		/*
		n�� ����ڷκ��� �Է¹ޱ� ������ �� �ʱ�ȭ ���� �ʾƵ� ������
		sum�� �ݺ������� sum = sum+i�� ������ �ؾ��ϱ� ������ �ݵ�� �ʱⰪ�� �־�� �Ѵ�!
		������ ���ϱ⸦ �Ұ��̶� 0���� �ʱ�ȭ�߽��ϴ�
		�־��� �����ذ��� ���Ͽ� �׶����� ������ ������ �ʱ�ȭ �ؾ� �մϴ�
		*/
		System.out.print("1���� � �� ���� ���ϱ� �ұ��?");
		n = sc.nextInt();
		for(int i = 1; i<=n; i++){
			sum += i;
		} 
		System.out.print("1���� "+n+"������ ���� "+sum+"�Դϴ�");

	}
}
