class MyUtil{
	static void gugudan(int dan){ //static을 붙여서 객체를 통하지 않아도 됌!
		System.out.printf("***%d단***\n",dan);
		for(int i=1;i<=9;i++){
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	} 
}  
/*
보통은 어떤 메소드를 사용하려면 그 메소가 있는 클래스의 객체를 생성하고 그 객체를 통해서 메소드를 호출함
그런데 그 메소드가 static이라면 객체를 통하지 않고 바로 클래스 이름을 사용가능
*/

class MethodTest02{
	public static void main(String []args){
		
		MyUtil.gugudan(9); //대신 바로 클래스 이름을 적어준다
		System.out.println("===========================");
		MyUtil.gugudan(10);
	}
}