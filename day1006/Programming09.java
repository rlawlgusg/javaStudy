import java.util.Scanner;
class Programming09
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double x, result; //�Ǽ����̴ϱ� double!

		System.out.println("����� x���� �Է��Ͻÿ�");
		x = sc.nextDouble();

		if(x <= 0){
			result = x*x*x-9*x+2;
		}else 
			result = 7*x+2;
		//if�� �ٱ����� ��� if�� �ȿ� ������ ���̵� �����̵� �Ѵ� ���
		System.out.println("���� "+result+" �Դϴ�");


	}
}
