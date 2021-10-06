import java.util.Scanner;
class PrintFactorialWhile
{
	public static void main(String[] args) 
	{
		int n, sum=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N을 입력하세요: ");
		n = sc.nextInt();


		int i = n;
		while (i >= 1){
			System.out.print(i); //i가 1보다 크거나 같을때 i를 출력해라
				if(i != 1){
					System.out.print("*"); // i가 1이 아닐때 
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
