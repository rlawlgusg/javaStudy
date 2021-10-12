class Department{
	private int number; 
	private String name;
	private String location;

	public Department(){
		number = 1;
		name = "������";
		location = "3��";
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setNumber(int number){
		this.number = number;
	}
	public int getNumber(){
		return number;
	}
	public void setLocation(String location){
		this.location = location;
	}
	public String getLocation(){
		return location;
	}
	public String toString(){
		String result = "";
		result += "�μ���ȣ "+number+"\n";
		result += "�μ��� "+name+"\n";
		result += "�μ���ġ "+location+"\n";
		return result;
	}
	

}

class DepartmentTest
{
	public static void main(String[] args) 
	{
		Department d = new Department();
		System.out.println(d.getName());
		System.out.println(d.getNumber());
		System.out.println(d.getLocation());
		System.out.println(d.toString());
		
		d.setName("ȸ���");
		d.setNumber(2);
		d.setLocation("4��");
		
		System.out.println(d.getName());
		System.out.println(d.getNumber());
		System.out.println(d.getLocation());
		System.out.println(d.toString());
		
		d.setLocation("6��");
		System.out.println(d);//��ġ�ٲ�
	}
}
