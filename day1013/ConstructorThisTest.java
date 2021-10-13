class Person{
   
   private String name;
   private int age;
   
   public Person(String name, int age){
   	this.name = name;
    this.age = age; 
    System.out.println("매개변수를 모두 갖는 생성자 동작함");
   }

   public Person(){
	System.out.println("매개변수를 갖지 않는 생성자 동작함");
	this("홍길동",20); //this는 생성자의 첫번째 문장에 와야함!  
   }

   public String toString(){
	return "이름: "+name+", 나이: "+age;
   }

}





class ConstructorThisTest 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("김유신",30);
		Person p2 = new Person();
		System.out.println(p1);
		System.out.println(p2);
	}
}

/*
ConstructorThisTest.java:15: error: call to this must be first statement in constructor
        this("홍길동",20);
*/