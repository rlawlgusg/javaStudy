import java.util.Scanner;
class Homework
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double height,kg,standard;
		System.out.print("Ű�� �Է��ϼ���: ");
		height = sc.nextDouble();
		System.out.print("ü���� �Է��ϼ���: ");
		kg = sc.nextDouble();

		standard = (height - 100)*0.9; // ���� +-10% 
		if (kg < standard*0.9)
		{
			System.out.print("��ü�� �Դϴ�!");
		}else if (kg > standard*1.1)
		{
			System.out.print("��ü�� �Դϴ�!");
		}else
			System.out.print("ǥ��ü�� �Դϴ�!");
	}
}
