import java.util.Scanner;
class Nnumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a;
		int n;
		System.out.print("������ ���� �Է��ϼ���: ");
        n = sc.nextInt();
		a = ((n%2==0)?"¦��":"Ȧ��");
		System.out.print("������ ���� "+a+"�Դϴ�");

		
	}
}
