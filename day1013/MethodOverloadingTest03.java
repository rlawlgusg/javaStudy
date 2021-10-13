class SistUtil{
	
	public static void max(int a,int b){
		max((double)a,(double)b);//필요하다면 메소드 안에서 나말고 다른 메소드를 호출할 수 있음
	}

	public static void max(double a,double b){
		double m = a;
		if(b > m){
			m = b;
		}	
		System.out.println("큰수는 "+m+"입니다");
		

	}
}
class MethodOverloadingTest03
{
	public static void main(String[] args) 
	{
		SistUtil.max(10,20);
		SistUtil.max(3.5,4.7);

	}
}
