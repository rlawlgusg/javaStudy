import java.util.Scanner;
class DivisorsTest
{
	public static void main(String[] args) 
	{
		int n;
		int divid = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("N을 입력해보세요: ");
		n = sc.nextInt();

		System.out.print("N의 약수는 ");
		for(int i=1; i<=n; i++){
			if(n % i == 0){
				System.out.print(i+" ");
			}
		}
		System.out.println("입니다");
	}
}
