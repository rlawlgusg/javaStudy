class Department{
	private int number; 
	private String name;
	private String location;

	public Department(int number, String name, String location){
		this.number = number;
		this.name = name;
		this.location = location;
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

class DepartmentTest02
{
	public static void main(String[] args) 
	{
		Department d1 = new Department(10,"�ѹ���","3��");
		Department d2 = new Department(20,"������","1��");
		System.out.println(d1);
		System.out.println(d2);

		
	}
}
