import java.util.Scanner;
class AgeTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("한사람의 나이를 입력하세요! ");
		a = sc.nextInt();
		System.out.print("나머지 한사람의 나이를 입력하세요! ");
		b = sc.nextInt();
		if (a == b)
	    System.out.print("축하합니다 서로 친구입니다");
		else
		System.out.print("나이가 같지 않습니다");

	}
}
