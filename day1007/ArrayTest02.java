class ArrayTest02
{
	public static void main(String[] args) 
	{

		int []a ;
			a = new int[5]; 
		int []b = new int[5];
		boolean []c = new boolean[5];
		double []d = new double[5];
		String []e = new String[5];

		a[0] = 100;
		b[0] = 100;

		System.out.println(a[0]);
		System.out.println(b[0]);
			//배열을 선언하면 초기화된다!
		System.out.println(a[1]); //정수형 0
		System.out.println(b[1]); //정수형 0
		System.out.println(c[1]); //false
		System.out.println(d[1]); //0.0
		System.out.println(e[1]); //null
		
		/*
		a[5] = 100;
		System.out.println(a[5]);
		
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
			Index 5 out of bounds for length 5

		Exception = 실행중에 발생한 오류! 
		*/


		
	}
}
