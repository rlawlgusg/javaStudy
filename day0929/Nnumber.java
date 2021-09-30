import java.util.Scanner;
class Nnumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a;
		int n;
		System.out.print("임의의 수를 입력하세요: ");
        n = sc.nextInt();
		a = ((n%2==0)?"짝수":"홀수");
		System.out.print("임의의 수는 "+a+"입니다");

		
	}
}
