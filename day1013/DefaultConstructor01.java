class Dog{
	
	private String name;
	public String breed;
	private int age; 
	//보통 속성들은 private에 두고 메소드들은 public에 두는게 일반적이지만 따르지 않아도됨.. 

	public String toString(){
		return "강아지의 이름은 "+name+" 나이는 "+age+" 종류는 "+breed;
	}

	
}


class DefaultConstructor01 
{
	public static void main(String[] args) 
	{

		Dog d1 = new Dog();
		System.out.println(d1);


	}
}
//강아지의 이름은 null 나이는 0 종류는 null
//사용자가 생성자를 한개도 만들지 않을 때에 자바는 기본생성자를 자동으로 제공한다!