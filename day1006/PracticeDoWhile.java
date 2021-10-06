import java.util.Scanner;
class PracticeDoWhile 
{
	public static void main(String[] args) 
	{
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.print("줄수를 입력하세요: ");
		a = sc.nextInt();
		System.out.print("칸수를 입력하세요: ");
		b = sc.nextInt();
		int tot;
		
		int i = 1;
		do{
				int j = 1;
				do{
				System.out.print("*");
				j++;
				}while(j<=b);	// j반복..
			System.out.println();
			i++;
		}while(i <= a);


		//어려워 ㅠ
	}
}
