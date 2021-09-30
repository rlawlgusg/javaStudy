/*
삼항연산자(조건식연산자)
(항1)?항2:항3
항1은 조건식
항1에 조건식이 true이면 항2를 수행, false이면 항3을 수행한다
항이 3개 있어 삼항식연산자라고도 하고 연산자에 조건식이 있다하여 조건식연산자라고 한다
짧은(간단한) if else를 줄여놓은 표현
예시     int a = 5;
		int b = (a>0)?100:0;
		System.out.println(b);

		int data = 5;
		System.out.println((data>0)?"OK":"NO");
*/
import java.util.Scanner;
class MinTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("첫번째 정수를 입력하세요: ");
		a = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요: ");
		b = sc.nextInt();
		System.out.println((a>b)?"둘중에 작은수는 "+b+"입니다":"둘중에 작은수는 "+a+"입니다");
		
	}
}
