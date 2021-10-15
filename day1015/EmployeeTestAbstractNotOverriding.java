import java.util.Scanner;
//추상메소드를 포함하고 있기 때문에 추상클래스가 되어야 함
abstract class Employee{
	protected String name;
	protected String number;
	protected int salary;//월급 계산해야하므로 추가
	
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

	public abstract void computeSalary();

	public String toString(){
		return "이름: "+name+" 사번: "+number;
	}

}
class SalariedEmployee extends Employee{ //기본급,수당,호봉
	private int grade;//호봉
	private int base;//기본금
	private int allowance;//수당
	
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
//월급 호봉에 따라 기본금과 수당을 결정 급여 = 기본금+수당
//1호봉부터 3호봉까지 있다고 가정
//1호봉 : 기본금 200, 수당 50
//2호봉 : 기본금 250, 수당 80
//3호봉 : 기본금 300, 수당 100
	/*
	public void computeSalary(){ 
		switch(grade){
			case 1:base = 200; allowance = 50; break;
			case 2:base = 250; allowance = 80; break;
			case 3:base = 300; allowance = 100;break;
		}
	salary = base + allowance;
	}
	*/
	public String toString(){
		return super.toString()+ " 호봉: "+grade+" 기본금: "+base+" 수당: "+allowance+" 월급: "+salary;
	}

}
class HourlyEmployee extends Employee{
	private int workhour;//일한 시간
	private int time_pay;//시간당 임금
	
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
		return super.toString()+ " 시간당 임금: "+ salary; //void타입이라 메소드 바로 못넣음
	}
}


class EmployeeTestAbstractNotOverriding
{
	public static void main(String[] args) 
	{	
		
		Employee e1;
		Scanner sc = new Scanner(System.in);
		int type; 
		String name;
		String number;
		do{
		System.out.print("사원의 종류를 입력하세요 1:월급제, 2:시간제");
		type = sc.nextInt();
		}while(type !=1 && type !=2); 
		
		System.out.print("사원의 이름을 입력하세요: ");
		name = sc.next();
		System.out.print("사원번호를 입력하세요: ");
		number = sc.next();
		
		if(type == 1){
			int grade; 
			System.out.print("사원의 호봉을 입력하세요: "); 
			grade = sc.nextInt();
			e1 = new SalariedEmployee(name,number,grade); 
		}else{
			int time_pay, workhour; 
			System.out.print("시간당 임금을 입력하세요: ");
			time_pay = sc.nextInt();
			System.out.print("일한 시간을 입력하세요: ");
			workhour = sc.nextInt();
			e1 = new HourlyEmployee(name, number, workhour, time_pay);
		}

			e1.computeSalary();
			System.out.println(e1);
		
	}
}
/*
java:36: error: 
SalariedEmployee is not abstract and does not override abstract method computeSalary() in Employee
class SalariedEmployee extends Employee

추상클래스를 상속받았다면 반드시 모든 추상메소드를 오버라이딩 해야함!
*/