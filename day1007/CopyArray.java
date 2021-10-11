class CopyArray //배열은 참조형변수기 때문에 복사안됌 기본형:값을 가지고 있음
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5};
		int []b = new int[5];
		b = a;

		a[0] = 100;
		
		System.out.println("a배열의 요소");
		for (int i:a){//이때 i는 인덱스가 아니라 a배열에 있는 요소를 하나씩 가져옴 
			System.out.printf("%5d",i);
		}
		System.out.println();

		System.out.println("b배열의 요소");
		for (int i:b){//이때 i는 인덱스가 아니라 a배열에 있는 요소를 하나씩 가져옴 
			System.out.printf("%5d",i);
		}




	}
}
