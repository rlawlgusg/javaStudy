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
			result += "사원번호 " + enumber +"\n";
			result += "사원명 " + ename +"\n";
			result += "급여 " + pay +"\n";
			result += "입사일 " + date +"\n";
			result += "부서명 " + department +"\n";
		return result;
	}
	
	
}


class EmployeeTest 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1,"홍길동",200,"2021/10/12","개발팀");
		System.out.println(e1);
		e1.setEnumber(2);
		System.out.println(e1);
		e1.setEname("김유신");
		System.out.println(e1);

	}
}
