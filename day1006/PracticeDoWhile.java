import java.util.Scanner;
class PracticeDoWhile 
{
	public static void main(String[] args) 
	{
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.print("�ټ��� �Է��ϼ���: ");
		a = sc.nextInt();
		System.out.print("ĭ���� �Է��ϼ���: ");
		b = sc.nextInt();
		int tot;
		
		int i = 1;
		do{
				int j = 1;
				do{
				System.out.print("*");
				j++;
				}while(j<=b);	// j�ݺ�..
			System.out.println();
			i++;
		}while(i <= a);


		//����� ��
	}
}
