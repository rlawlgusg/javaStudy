//에러
class  DivTestTryCatch04
{
	public static void main(String[] args) 
	{
		try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int result = a/b;
		System.out.println("결과: "+result);
		}catch(Exception e){
			System.out.println("두번째수가 0이 아닌 두개의 숫자를 전달해 주세요");
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수는 없어요");
		}

	
	}
}
