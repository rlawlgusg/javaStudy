import java.util.Scanner;
class Hour
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int h, d1, d2, d3;
		System.out.println("�ð��� �ʴ����� �Է��ϼ���");
		h = sc.nextInt();

		d1 = h / 3600;
		d2 = (h % 3600) / 60;
		d3 = (h % 3600) % 60;
		System.out.println("�ð��� "+d1+"��"+d2+"��"+d3+"�� �Դϴ�");

	}
}
