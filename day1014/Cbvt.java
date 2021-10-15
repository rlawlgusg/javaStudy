class Cbvt{
	//값에 의한 호출!
	public static void MultiplyByTen(int n){
		n = n*10;
		System.out.println(n);
	}
	
	public static void MinusThree(int n){
		n = n-3;
		System.out.println(n);
	}
	
	public static void PlusFive(int n){
		n = n+5;
		System.out.println(n);
	}

	public static void main(String[] args){
		int a = 4;
		MultiplyByTen(a);//40
		System.out.println(a);//4
		MinusThree(a);//1
		System.out.println(a);//4
		PlusFive(a);//9
		System.out.println(a);//4



	}
}

