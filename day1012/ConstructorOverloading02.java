class Emp{
	private String name;
	private int sal;
	private String addr;

	public String toString(){
		return "�̸�: "+name+" �޿�: "+sal+" �ּ�: "+addr;
	}

	public Emp(){
		name = "ȫ�浿";
		sal = 500;
		addr = "����";
	}

	public Emp(String name, int sal, String addr){
		this.name = name;
		this.sal = sal;
		this.addr = addr;
	}
	
	public Emp(String name){
		this.name = name;
		sal = 500;
		addr = "����";
	}
	
	public Emp(String name,int sal){
		this.name = name;
		this.sal = sal;
		addr = "����";
	}
	//������ �ٸ���� �ߺ��� �� �ִ�!!!!!!!!!!!!!!!!!
	public Emp(int sal, String name){
		this.sal = sal;
		this.name = name;
		addr = "����";
	}

	/*
	public Emp(String addr){
		this.addr = addr;
		name = "ȫ�浿";
		sal = 500;
	}
	
	constructor Emp(String) is already defined in class Emp
        public Emp(String addr){
	*/

	/* ����!
	public Emp(int sal, String addr){
		this.sal = sal;
		this.addr = addr;
		name = "ȫ�浿";
	}
	*/

	public Emp(String name, String addr){
		this.name = name;
		this.addr = addr;
		sal = 500;
	}

}


class ConstructorOverloading02
{
	public static void main(String[] args) 
	{
		
		Emp a = new Emp();
		System.out.println(a);

		Emp b = new Emp("������", 600 , "����");
		System.out.println(b);
		
		Emp c = new Emp("������");
		System.out.println(c);

		Emp d = new Emp("������", 700);
		System.out.println(d);

		Emp e = new Emp(800, "�̼���");
		System.out.println(e);

		
	
	}
}
