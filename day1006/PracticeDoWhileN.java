import java.util.Scanner;
class PracticeDoWhileN
{
	public static void main(String[] args) 
	{
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.print("N�� �Է��ϼ���: ");
	n = sc.nextInt();

/*
	for(int i = 1 ; i <= n ; i++){ // �� = N �ٻ���! ����..
		for(int j = 1 ; j <= i ; j++){ //N�� ���ڸ�ŭ �ݺ�! ĭ����..
			
			System.out.print("*"); *�� ��´� 
		}
		System.out.println(); �ٹٲ�...
	}//for�� */

/*		
	int i = 1;
	while(i<=n){
			int j =1;
			while(j<=i){
				System.out.print("*");
				j++;
			}
		System.out.println();
		i++;
	}//while�� */


	int i = 1;
	do{

		int j = 1;
		do{
			System.out.print("*");
			j++;
		}while(j <= i);

		System.out.println();
		i++;
	}while(i <= n); //do while�� 
	


		
		
		
	}
}
