class Person{
	private String name;
	public void setName(String name){
		name = name;
	}
	public String getName(){
		return name;
	}

}


class PersonTest03
{
	public static void main(String[] args) 
	{
		
		Person p1 = new Person();
		p1.setName("ȫ�浿");
		
		System.out.println(p1.getName());
	}
}
