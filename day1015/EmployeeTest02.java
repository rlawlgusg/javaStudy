class Employee{
	protected String name;
	protected String number;
	protected int salary;//���� ����ؾ��ϹǷ� �߰�
	
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
	public int getSalary(){
		return salary;
	}

	public void computeSalary(){
		//�� ���� ������ ��üȭ �� �� ��� �����
	}

	public String toString(){
		return "�̸�: "+name+" ���: "+number;
	}

}
class SalariedEmployee extends Employee{ //�⺻��,����,ȣ��
	private int grade;//ȣ��
	private int base;//�⺻��
	private int allowance;//����
	
	public SalariedEmployee(){}
	public SalariedEmployee(String name, String number, int grade){
		super(name, number);
		this.grade = grade;
	}
	public void setGrade(int grade){
		this.grade = grade;
	}
	public double getGrade(){
		return grade;
	}
	public int getBase(){
		return base;
	}
	public int getAllowance(){
		return allowance;
	}
//���� ȣ���� ���� �⺻�ݰ� ������ ���� �޿� = �⺻��+����
//1ȣ������ 3ȣ������ �ִٰ� ����
//1ȣ�� : �⺻�� 200, ���� 50
//2ȣ�� : �⺻�� 250, ���� 80
//3ȣ�� : �⺻�� 300, ���� 100
	public void computeSalary(){ 
		switch(grade){
			case 1:base = 200; allowance = 50; break;
			case 2:base = 250; allowance = 80; break;
			case 3:base = 300; allowance = 100;break;
		}
	salary = base + allowance;
	}
	public String toString(){
		return super.toString()+ " ����: "+salary;
	}

}
class HourlyEmployee extends Employee{
	private int workhour;//���� �ð�
	private int time_pay;//�ð��� �ӱ�
	
	public HourlyEmployee(){}
	public HourlyEmployee(String name, String number,int workhour, int time_pay){
		super(name, number);
		this.workhour = workhour;
		this.time_pay = time_pay;
	}
	public void setWorkhour(int workhour){
		this.workhour = workhour;
	}
	public int getWorkhour(){
		return workhour;
	}
	public void setTime_pay(int time_pay){
		this.time_pay = time_pay;
	}
	public int getTime_pay(){
		return time_pay;
	}

	public void computeSalary(){
		salary = workhour*time_pay;
	}
	public String toString(){
		return super.toString()+ " �ð��� �ӱ�: "+ salary; //voidŸ���̶� �޼ҵ� �ٷ� ������
	}
}


class EmployeeTest02
{
	public static void main(String[] args) 
	{	
		//��Ӱ��迡 ���� �� �θ�Ŭ������ ���������� �ڽ�Ŭ������ ��ü�� ������ �� �־��!
		Employee e = new Employee("ȫ�浿","1234");
		System.out.println(e);
		Employee s = new SalariedEmployee("������","3452",1);
//�θ�Ŭ������ ��������         �ڽ�Ŭ������ ��ü
		s.computeSalary();
		System.out.println(s);
		Employee h = new HourlyEmployee("�̼���","2341",8,9000);
		System.out.println(h);
		h.computeSalary(); // �޿����
		System.out.println(h);

	}
}
