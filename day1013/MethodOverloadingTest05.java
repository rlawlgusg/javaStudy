//정수 두개를 매개변수로 전달받아 큰 수를 찾아 반환하는 메소드,
//정수 세개를 매개변수로 전달받아 큰 수를 찾아 반환하는 메소드,
//정수 네개를 매개변수로 전달받아 큰 수를 찾아 반환하는 메소드,
//중복하여 정의하고 각각을 호출
class MethodOverloading{
	public static int max(int a,int b){
		int max = a;
		if(b > max){
			max = b;
		}
			return max;
	}
	public static int max(int a,int b,int c){
		return max(max(a,b),c); //메소드안에서 메소드를 호출함
		
	}
	public static int max(int a,int b,int c,int d){
		return max(max(a,b),max(c,d));
	}

}

class MethodOverloadingTest05 
{
	public static void main(String[] args) 
	{
		
		System.out.println("큰수는 "+MethodOverloading.max(3,5));
		System.out.println("큰수는 "+MethodOverloading.max(3,5,2));
		System.out.println("큰수는 "+MethodOverloading.max(3,5,6,7));
	}
}
