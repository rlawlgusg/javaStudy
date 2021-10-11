class MyUtil{
	static int getmax(int a, int b){
		int max = a;		
		if(b > max){
			max = b;
		}
		return max;//max를 호출한 값으로 돌아가세요!!!!!!!!!!!1
	} 
}  
/*
보통은 어떤 메소드를 사용하려면 그 메소가 있는 클래스의 객체를 생성하고 그 객체를 통해서 메소드를 호출함
그런데 그 메소드가 static이라면 객체를 통하지 않고 바로 클래스 이름을 사용가능
*/

class MethodTestMax{
	public static void main(String []args){
		int age1 = 26;
		int age2 = 28;
		int result;
		result = MyUtil.getmax(age1,age2); //호출한값으로 돌아옴..
		System.out.println(result);//max값 반환
	}
}