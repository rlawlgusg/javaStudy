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
		return "�̸�: "+name+" ���: "+number;
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
	
	public int computeSalary(int workhour,int time_pay){ //����
		return workhour*time_pay*working_time;
	}
	public String toString(){
		super.toString()+ "����: "+pay;
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
		super.toString()+ "�ð��� �ӱ�: "+ workhour+"���ѽð�: "+time_pay;
	}
}


class EmployeeTest
{
	public static void main(String[] args) 
	{	
		Employee e = new Employee("ȫ�浿","1234");
		System.out.println(e);
	}
}
