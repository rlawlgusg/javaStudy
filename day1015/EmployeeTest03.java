import java.util.Scanner;

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
		return super.toString()+ " ȣ��: "+grade+" �⺻��: "+base+" ����: "+allowance+" ����: "+salary;
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


class EmployeeTest03
{
	public static void main(String[] args) 
	{	
		//��Ӱ��迡 ���� �� �θ�Ŭ������ ���������� �ڽ�Ŭ������ ��ü�� ������ �� �־��!
		//��������� �������������, �ð���������� ��� �Ŀ� �����͸� �Է¹޾� ó��
		//�׷� ������ ������ ����� ������ �� �ְ�, �ð��� ����� ������ �� �ִ� �̰͵��� �θ��� Employee��
		//���������� ����� ��

		//SalariedEmployee e1 �̰͹ۿ� ������
		//HourlyEmployee e1 �̰͹ۿ� ������
		Employee e1;
		Scanner sc = new Scanner(System.in);
		int type; //�������� 1 �ð����� 2
		String name;
		String number;
		
		do{
		System.out.print("����� ������ �Է��ϼ��� 1:������, 2:�ð���");
		type = sc.nextInt();
		}while(type !=1 && type !=2); //1�̰ų� 2�̸� do-while�� Ż��
		
		System.out.print("����� �̸��� �Է��ϼ���: ");
		name = sc.next();
		System.out.print("�����ȣ�� �Է��ϼ���: ");
		number = sc.next();

		//setter�� getter�� �̿��ؼ� �Է��ϴ� ���!
		switch(type){
			case 1: e1 = new SalariedEmployee(); 
			int grade; System.out.print("����� ȣ���� �Է��ϼ���: "); 
			grade = sc.nextInt();
			((SalariedEmployee)e1).setGrade(grade);
			break;

			default: 
			//�� ������ case2��� �ϸ� �ڹٿ����� 1,2�ܿ� �ٸ� ��쵵 �� �׷��� ��ü ������ �ȵɼ��� �ִٰ� ��
			e1 = new HourlyEmployee();
			int time_pay, workhour; 
			System.out.print("�ð��� �ӱ��� �Է��ϼ���: ");
			time_pay = sc.nextInt();
			System.out.print("���� �ð��� �Է��ϼ���: ");
			workhour = sc.nextInt();
			((HourlyEmployee)e1).setTime_pay(time_pay);
			((HourlyEmployee)e1).setWorkhour(workhour);
			
		}
			e1.setName(name);
			e1.setNumber(number);
			e1.computeSalary();
			System.out.println(e1);
		
	}
}
