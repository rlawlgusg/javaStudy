class SistUtil{
	
	public static void max(double a,double b){
		double m = a;
		if(b > m){
			m = b;
		}	
		System.out.println("큰수는 "+m+"입니다");
		

	}
}
class MethodOverloadingTest04
{
	public static void main(String[] args) 
	{
		SistUtil.max(10,20);
		//꼭 맞는 int를 갖는 메소드가 있으면 거기로 가지만 없다면 double은 int로 포함하니까 double을 갖는 메소드가 동작함
		SistUtil.max(3.5,4.7);

	}
}
