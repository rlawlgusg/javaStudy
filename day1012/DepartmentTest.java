class Department{
	private int number; 
	private String name;
	private String location;

	public Department(){
		number = 1;
		name = "영업부";
		location = "3층";
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
		result += "부서번호 "+number+"\n";
		result += "부서명 "+name+"\n";
		result += "부서위치 "+location+"\n";
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
		
		d.setName("회계부");
		d.setNumber(2);
		d.setLocation("4층");
		
		System.out.println(d.getName());
		System.out.println(d.getNumber());
		System.out.println(d.getLocation());
		System.out.println(d.toString());
		
		d.setLocation("6층");
		System.out.println(d);//위치바뀜
	}
}
