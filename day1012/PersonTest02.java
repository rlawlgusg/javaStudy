class Person{
	
	private String name;
	private int age;

	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}

	public void setAge(int a){
		age = a;
	}

	public int getAge(){
		return age;
	}


}


class PersonTest02
{
	public static void main(String[] args) 
	{
		Person p1 = new Person(); 
		//p1.name = "홍길동";
		//p1.age = 20;
		p1.setName("홍길동");
		p1.setAge(20);

		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}
}
/*
PersonTest02.java:14: error: name has private access in Person
                p1.name = "홍길동";
                  ^
PersonTest02.java:15: error: age has private access in Person
                p1.age = 20;
                  ^
PersonTest02.java:16: error: name has private access in Person
                System.out.println(p1.name);
                                     ^
PersonTest02.java:17: error: age has private access in Person
                System.out.println(p1.age);

person클래스의 private영역인 속성(멤버변수)에 직접 접근할 수 없음
접근할 수 있는 메소드를 public에 만들어 두고 사용해야함!
접근해서 값을 변경하는 메소드는 setXXX()로 만들고 접근해서 값을 읽어오는 메소드는 getXXX()로 만듬
이것을 setter, getter라고 부름
따라서 클래스를 만들때에 보통은 모든 멤버변수들은 private영역에 두고 그 private영억에 멤버변수에 접근하기 위한
setter, getter를 public에 모두 만들어야 함!!!

setter는 멤버변수 값을 변경하기 위한 메소드이니 어떤값으로 바꿀지 메개변수가 필요하고 반환값이 없음 
getter는 매개변수가 필요없음 멤버변수의 값을 반환하는 메소드이니 반환값이 있음!!
*/