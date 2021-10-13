class Dog{
	
	private String name;
	public String breed;
	private int age; 
	//보통 속성들은 private에 두고 메소드들은 public에 두는게 일반적이지만 따르지 않아도됨.. 
	
	public Dog(String name,int age,String breed){
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	public String toString(){
		return "강아지의 이름은 "+name+" 나이는 "+age+" 종류는 "+breed;
	}

	
}


class DefaultConstructor02 
{
	public static void main(String[] args) 
	{

		Dog d1 = new Dog();
		System.out.println(d1);


	}
}
/*
C:\javaStudy\day1013>javac DefaultConstructor02.java
DefaultConstructor02.java:27: error: constructor Dog in class Dog cannot be applied to given types;
                Dog d1 = new Dog();
                         ^
  required: String,int,String
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error

사용자가 생성자를 만들었기 때문에 기본생성자가 제공되지 않음
매개변수를 모두 갖는 생성자만 사용하던지 필요하다면 매개변수를 갖지 않는 생성자를 사용자가 만들어주어야함

앞으로 생성자를 만들때에는 반드시 기본 생성자도 만들어 주세요!
*/