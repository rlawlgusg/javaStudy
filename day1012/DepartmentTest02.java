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
		result += "ºÎ¼­¹øÈ£ "+number+"\n";
		result += "ºÎ¼­¸í "+name+"\n";
		result += "ºÎ¼­À§Ä¡ "+location+"\n";
		return result;
	}
	

}

class DepartmentTest02
{
	public static void main(String[] args) 
	{
		Department d1 = new Department(10,"ÃÑ¹«ÆÀ","3Ãþ");
		Department d2 = new Department(20,"°³¹ßÆÀ","1Ãþ");
		System.out.println(d1);
		System.out.println(d2);

		
	}
}
