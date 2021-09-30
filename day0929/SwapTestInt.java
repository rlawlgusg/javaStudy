class SwapTestInt 
{
	public static void main(String[] args) 
	{
		int a = 7;
		int b = 9;

		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		/* 보통은 이렇게 많이 쓴다! 
		int c;
		c = a;
		a = b;
		b = c;*/
        
		//정수인 경우 가능
        a = a^b;
		b = b^a;
		a = a^b;

		System.out.println("a와 b의 값을 서로 바꾸었습니다");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
