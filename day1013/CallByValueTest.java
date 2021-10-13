/*
값에 의한 호출(Call by Value)
메소드 호출시에 기본자료형이 전달되는 경우를 말하며 메소드 안에서 전달된 내용이 변경되더라도 호출하는 쪽에서는
적용되지 않음 
*/
class CallByValueTest 
{
	public static void PlusOne(int n){
		n = n+1;
		System.out.println(n);
	}

	public static void main(String[] args) 
	{
		int data = 100;
		PlusOne(data);//101
		System.out.println(data);//100
	}
}
