class RecursiveMethodSum
{
	public static int getSum(int n){
		if(n == 1){
			return 1;
		}
		return n + getSum(n-1);
	}



	public static void main(String[] args) 
	{

		System.out.printf("1에서 10까지의 합 = %d\n",getSum(10));
		System.out.printf("1에서 9까지의 합 = %d\n",getSum(9));
	}
}
