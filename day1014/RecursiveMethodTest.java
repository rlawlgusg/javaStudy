class RecursiveMethodTest 
{
	//n을 매개변수로 전달받아 n!를 구하여 반환하는 메소드를 재귀호출울 이용하여 정의
	public static int getFactorial(int n){
		if(n==1){
			return 1;
		}//메소드의 역할에 따라서 끝나는 조건은 다를 수 있음
		return n * getFactorial(n-1);
	}

	public static void main(String[] args) 
	{
		System.out.printf("5! = %d\n",getFactorial(5));
		System.out.printf("7! = %d\n",getFactorial(7));

	}
}
