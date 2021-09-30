//비트연산자 중에 비트곱(&)과 비트합(|)은 논리연산자로도 사용할 수 있다
import java.util.Scanner;
class Age
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age1;
		int age2;

		System.out.print("첫번째 사람의 나이를 입력하세요");
		age1 = sc.nextInt();
		System.out.print("두번째 사람의 나이를 입력하세요");
		age2 = sc.nextInt();

		if(age1>=20 & age2>=20) 
		System.out.println("두사람 모두 성인입니다");
		else
		System.out.println("두사람 모두 20살 이상이 아닙니다");

	}
}
