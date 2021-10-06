import java.util.Scanner;
class PracticeDoWhileN
{
	public static void main(String[] args) 
	{
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.print("N을 입력하세요: ");
	n = sc.nextInt();

/*
	for(int i = 1 ; i <= n ; i++){ // 행 = N 줄생성! 세로..
		for(int j = 1 ; j <= i ; j++){ //N의 숫자만큼 반복! 칸생성..
			
			System.out.print("*"); *을 찍는다 
		}
		System.out.println(); 줄바꿈...
	}//for문 */

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
	}//while문 */


	int i = 1;
	do{

		int j = 1;
		do{
			System.out.print("*");
			j++;
		}while(j <= i);

		System.out.println();
		i++;
	}while(i <= n); //do while문 
	


		
		
		
	}
}
