/*
논리연산자(&&)와 비트연산자(&) 모두 두개의 조건을 만족하는지 판별하는 용도로 사용가능
그러나 논리연산자(&&)는 비트연산자(&)보다는 짧은 연산을 수행합니다
두개의 조건식을 모두 만족해야만 전체를 참으로 처리하는 연산이기 때문에 
논리연산자(&&)는 만약 첫번째 조건식이 거짓이라면 두번째 조건식은 수행하지 않습니다
비트연산자는 앞에가 false여도 무조건 실행한다

&&, || 를 short cut operator라고 합니다
&&는 앞의 조건식이 거짓이면 뒤에 있는 조건식을 수행하지 않아요
||는 앞의 조건식이 참이면 뒤에 있는 조건식을 수행하지 않아요 
*/

import java.util.Scanner;
class BitLogical02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age1;
		int age2;

		System.out.print("첫번째 사람의 나이를 입력하세요: ");
		age1 = sc.nextInt();
		System.out.print("두번째 사람의 나이를 입력하세요: ");
		age2 = sc.nextInt();

		if(++age1>=20 && ++age2>=20) 
		//논리연산자&& 일때 age1에 18을 넣을경우 앞에 조건이 거짓이 되므로 age2는 작동하지 않는다
		//if(++age1>=20 & ++age2>=20) 
		System.out.println("두사람의 나이를 1씩 증가하면 두사람 모두 20살 이상입니다");
		else
		System.out.println("두사람의 나이를 1씩 증가하면 두사람 모두 20살 이상이 아닙니다");

		System.out.println("age1: "+ age1);
		System.out.println("age2: "+ age2);

	}
}
