class Person{
	private String name;
	private int age;

	public Person(){
		name ="������";
		age = 20;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}


}


class ConstructorTest
{
	public static void main(String[] args) 
	{
		Person kim = new Person(); //��ü�� �����ϴ� ���� name�� ������ age�� 20�� �ȴ�
		System.out.println(kim.getName());
		System.out.println(kim.getAge());
		
		kim.setName("����ö");
		kim.setAge(21);
		System.out.println(kim.getName());
		System.out.println(kim.getAge());
		
	}
}
