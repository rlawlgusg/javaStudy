import java.util.Scanner;
class Ninput
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int multi = 1;
		System.out.println("N을 입력하세요");
		n = sc.nextInt();

		for(int i = n; i >=1 ; i=i-1){
		   multi = multi*i ;
		   System.out.print(i);
		   if(i!=1){
			 System.out.print("*");
		   }
		}
		   System.out.println("="+multi);

	}
}
