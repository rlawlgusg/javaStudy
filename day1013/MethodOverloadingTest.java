class SistUtil{
	//두개의 정수를 매개변수로 전달받아 그 중에 큰수를 찾아 출력하는 메소드를 정의
	public void max(int a,int b){
		int m = a;
		if(b > m){
			m = b;
		}
			System.out.println("큰수는 "+m+"입니다");
	}
	//두개의 실수를 매개변수로 전달받아 그 중에 큰수를 찾아 출력하는 메소드를 정의
	public void max(double a,double b){
		double m = a;
		if(b > m){
			m = b;
		}	
		System.out.println("큰수는 "+m+"입니다");
		

	}
}
class MethodOverloadingTest 
{
	public static void main(String[] args) 
	{
		
		SistUtil s1 = new SistUtil();
		SistUtil s2 = new SistUtil();
		s1.max(3,5);
		s2.max(3.2,7.5);

	}
}
//속성에 멤버변수가 없음! 객체로 만들 필요가 없음! static 사용하는게 좋다