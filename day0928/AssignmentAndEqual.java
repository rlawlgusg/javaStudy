class AssignmentAndEqual 
{
	public static void main(String[] args) 
	{
		//자바프로그램에서는 대입(assign)연산자와 같은지 비교(equal)의 연산자가 다릅니다
		//=은 대입을 위한 연산자이고 ==은 같은지 비교하는 연산자 입니다

		int age;
		boolean flag;
		
		//age에 20이라는 값을 대입
		//20 = age
		age = 20;

		//age의 값이 20과 같은지 비교하여 논리값을 flag에 대입
		flag = age == 20;

		System.out.println(age);
		System.out.println(flag);
	}
}
