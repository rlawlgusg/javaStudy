import java.util.Scanner;
class PrintDoWhileN 
{
	public static void main(String[] args) 
	{
		int n;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("N�� �Է��Ͻÿ�: ");
		n = sc.nextInt();

		int i = 1;
		do{
			sum += i;
				i++;
		}while(i<=n);
			System.out.printf("1���� %d������ ���� %d�Դϴ�",n,sum);




	}
}
