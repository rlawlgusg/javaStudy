class A{
	
	public A(int i){ //기본생성자가 만들어지지 않아서 오류남!
		System.out.println("A의 매개변수를 갖는 생성자 동작함");
	}
}

class B extends A{
	public B(){
		super(100);
		System.out.println("B의 생성자 동작함");
	}
}

class InheritanceTestConstructor04
{
	public static void main(String[] args) 
	{
		B ob = new B();
		//자식클래스의 객체를 먼저 생성하면 부모의 생성자가 먼저 동작
		
	}
}
/*
InheritanceTestConstructor02.java:8: error: constructor A in class A cannot be applied to given types;
                super();//부모클래스의 기본생성자를 요구
                ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error

자식클래스 생성자의 첫번째 줄에는 부모클래스의 기본생성자를 요구하는 super()가 생략되어있습니다
그런데 부모클래스인 A클래스에 기본생성자가 없으므로 오류가 발생함 

>>부모클래스의 기본생성자를 만들어 주거나 자식클래스의 생성자에서 부모클래스의 매개변수를 갖는 생성자를 요구해야함

*/