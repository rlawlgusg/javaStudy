/*
재귀호출
1.메소드 내에서 자기자신을 반복적으로 호출
2.반복문으로 바꿀 수 있음
3.반복문보다 성능이 안좋다..
4.이해 쉽고 간결한 코드 작성가능
5.재귀함수형태로 많이 사용 ex)팩토리얼!, 제곱
*/
class Recursivecall
{
	public int factorial(int f){
		if(f == 1){
			return 1;
		}else 
			return f * factorial(f-1);
	}

	public static void main(String[] args) 
	{
		System.out.println(factorial(5));
	}
}
