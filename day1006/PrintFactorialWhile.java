import java.util.Scanner;
class PrintFactorialWhile
{
	public static void main(String[] args) 
	{
		int n, sum=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N�� �Է��ϼ���: ");
		n = sc.nextInt();


		int i = n;
		while (i >= 1){
			System.out.print(i); //i�� 1���� ũ�ų� ������ i�� ����ض�
				if(i != 1){
					System.out.print("*"); // i�� 1�� �ƴҶ� 
				}
			sum *= i; //sum = sum*i 
			i--;
		}

		System.out.println("=" + sum);

		/*
		int i = n;
		while(i != 0){
			sum = sum*i
				i--;
		}*/


	}
}
