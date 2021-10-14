class Employee{
	protected String name;
	protected String number;
	
	public Employee(){}
	public Employee(String name, String number){
		this.name = name;
		this.number = number;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setNumber(String number){
		this.number = number;
	}
	public String getNumber(){
		return number;
	}

	public int computeSalary(){
		return 0; 
	}

	public String toString(){
		return "이름: "+name+" 사번: "+number;
	}

}
class SalariedEmployee extends Employee{
	private double pay;
	private int working_time;
	
	public SalariedEmployee(){}
	public SalariedEmployee(String name, String number, double pay){
		super(name, number);
		this.pay = pay;
	}
	public void setPay(double pay){
		this.pay = pay;
	}
	public double getPay(){
		return pay;
	}
	
	public int computeSalary(int workhour,int time_pay){ //월급
		return workhour*time_pay*working_time;
	}
	public String toString(){
		super.toString()+ "월급: "+pay;
	}


}
class HourlyEmployee extends Employee{
	private int workhour;
	private int time_pay = 0;
	
	public HourlyEmployee(){}
	public HourlyEmployee(String name, String number,int workhour, int time_pay){
		super(name, number);
		this.workhour = workhour;
		this.time_pay = time_pay;
	}
	public void setWorkhour(int workhour){
		this.workhour = workhour;
	}
	public int getTime_pay(){
		return time_pay;
	}
	public int computeSalary(int){
		return workhour*time_pay;
	
	public String toString(){
		super.toString()+ "시간당 임금: "+ workhour+"일한시간: "+time_pay;
	}
}


class EmployeeTest
{
	public static void main(String[] args) 
	{	
		Employee e = new Employee("홍길동","1234");
		System.out.println(e);
	}
}
