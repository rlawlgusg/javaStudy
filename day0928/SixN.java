import java.util.Scanner;
class SixN
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("임의의 수 N을 입력하세요");
		n = sc.nextInt();
		boolean flag;
		flag = n % 6 == 0;
        System.out.println(flag);
		
		
	}
}
