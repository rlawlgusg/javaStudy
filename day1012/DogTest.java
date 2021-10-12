class Dog{
	
	private String name;
	private String breed;
	private int age;

	public String toString(){
		return "�������� �̸��� "+name+" ���̴� "+age+" ������ "+breed;
	}
	public Dog(String name,int age){
		this.name = name;
		this.age = age;
		//�������� null������ ����
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
		Dog d1 = new Dog("����",4);
		System.out.println(d1);

		Dog d2 = new Dog("����","��Ƽ��",5);
		System.out.println(d2);
		
		d1.setName("������1");
		d2.setName("������2");
		System.out.println(d1);
		System.out.println(d2);
	}
}
