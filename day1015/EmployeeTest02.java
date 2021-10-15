class Employee{
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

	public void computeSalary(){
		//이 안의 내용을 구체화 할 수 없어서 비워둠
	}

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
	public void computeSalary(){ 
		switch(grade){
			case 1:base = 200; allowance = 50; break;
			case 2:base = 250; allowance = 80; break;
			case 3:base = 300; allowance = 100;break;
		}
	salary = base + allowance;
	}
	public String toString(){
		return super.toString()+ " 월급: "+salary;
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


class EmployeeTest02
{
	public static void main(String[] args) 
	{	
		//상속관계에 있을 때 부모클래스의 참조변수가 자식클래스의 객체를 참조할 수 있어요!
		Employee e = new Employee("홍길동","1234");
		System.out.println(e);
		Employee s = new SalariedEmployee("김유신","3452",1);
//부모클래스의 참조변수         자식클래스의 객체
		s.computeSalary();
		System.out.println(s);
		Employee h = new HourlyEmployee("이순신","2341",8,9000);
		System.out.println(h);
		h.computeSalary(); // 급여계산
		System.out.println(h);

	}
}
