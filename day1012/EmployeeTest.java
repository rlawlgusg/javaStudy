class Employee{
	private int enumber;
	private String ename;
	private int pay;
	private String date;
	private String department;

	public Employee(int enumber,String ename,int pay,String date,String department){
		this.enumber = enumber;
		this.ename = ename;
		this.pay = pay;
		this.date = date;
		this.department = department;
	}

	public void setEnumber(int enumber){
		this.enumber = enumber;
	}
	public int getEnumber(){
		return enumber;
	}
	
	public void setEname(String ename){
		this.ename = ename;
	}
	public String getEname(){
		return ename;
	}
	public void setPay(int pay){
		this.pay = pay;
	}
	public int getPay(){
		return pay;
	}
	public void setDate(String date){
		this.date = date;
	}
	public String getDate(){
		return date;
	}
	public void setDapartment(String department){
		this.department = department;
	}
	public String getDepartment(){
		return department;
	}
	
	public String toString(){
		String result = "";
			result += "�����ȣ " + enumber +"\n";
			result += "����� " + ename +"\n";
			result += "�޿� " + pay +"\n";
			result += "�Ի��� " + date +"\n";
			result += "�μ��� " + department +"\n";
		return result;
	}
	
	
}


class EmployeeTest 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1,"ȫ�浿",200,"2021/10/12","������");
		System.out.println(e1);
		e1.setEnumber(2);
		System.out.println(e1);
		e1.setEname("������");
		System.out.println(e1);

	}
}
