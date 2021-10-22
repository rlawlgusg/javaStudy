/*
프로그램 실행시에 두개의 정수를 전달받아 나누기한 결과를 출력하는 프로그램 작성
프로그램 실행시에 필요하다면 그 프로그램 실행에 필요한 값을 전달할 수 있음!
이렇게 전달하는 값은 main 메소드의 매개변수 배열로 전달가능
전달한 것 만큼 배열의 크기가 정해지고 차례대로 0번째 요소부터 쌓이게 됌 
java DiveTest 4 2 

*/
class  DivTestTryCatch
{
	public static void main(String[] args) 
	{
		try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int result = a/b;
		System.out.println("결과: "+result);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("실행시에 나누기할 두수를 전달하세요");
		}


	}
}
