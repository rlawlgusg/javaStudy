//비교연산자 : 두개의 값을 서로 비교하기 위한 연산자들 < > <= >= == 
//크거나 같은지 판별하기 위해서는 공백없이 >기호와 =를 붙여서 사용하고 순서바꾸면 안됌 
//비교연산의 결과는 boolean자료형이다 
//비교연산자는 보통 어떠한 조건식에 따라 동작시켜야 할 문장이 달라질 때 사용하는 선택문의 조건식에서 사용
import java.util.Scanner;
class Min
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("첫번째 정수를 입력하시오");
		a = sc.nextInt();
		System.out.println("두번째 정수를 입력하시오");
		b = sc.nextInt();
		
		if(a>b)
	    System.out.println("작은 수는 "+b);
		else
		System.out.println("작은 수는 "+a);
	}
}
