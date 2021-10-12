class Dog{
	
	private String name;
	private String breed;
	private int age;

	public String toString(){
		return "강아지의 이름은 "+name+" 나이는 "+age+" 종류는 "+breed;
	}
	public Dog(String name,int age){
		this.name = name;
		this.age = age;
		//안적으면 null값으로 나옴
	}
	
	public Dog(String name,String breed,int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void setBreed(String breed){
		this.breed = breed;
	}
	public String getBreed(){
		return breed;
	}

	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
}


class DogTest 
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog("해피",4);
		System.out.println(d1);

		Dog d2 = new Dog("초코","말티즈",5);
		System.out.println(d2);
		
		d1.setName("강아지1");
		d2.setName("강아지2");
		System.out.println(d1);
		System.out.println(d2);
	}
}
