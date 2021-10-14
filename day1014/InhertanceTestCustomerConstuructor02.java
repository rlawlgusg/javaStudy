class Person{ //부모클래스
	protected String name;
	protected String addr;
	protected String phone;
	public Person(String name,String addr,String phone){
		this.name=name;
		this.addr=addr;
		this.phone=phone;
	}
	//기본생성자가 없음!!!!!!!!!!!!!!!!!!!!!!

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAddr(String addr){
		this.addr=addr;
	}
	public String getAddr(){
		return addr;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return phone;
	}

}
class Customer extends Person{ //자식클래스
	private String number;
	private double mileage;
	public Customer(String name, String addr, String phone, String number,double mileage){//상속받았기 때문에 매개변수가 5개임
		//매개변수를 갖는 생성자를 요구하지 않았기 때문에 super();가 생략되었다
		//super()는 부모클래스의 기본생성자를 요구함! 하지만 없음! 그래서 오류남
		this.number = number;
		this.mileage = mileage;
	}
	public Customer(){}

	public void setNumber(String number){
		this.number=number;
	}
	public String getNumber(){
		return number;
	}
	public void setMileage(double mileage){
		this.mileage=mileage;
	}
	public double getMileage(){
		return mileage;
	}
	public void printCustomer(){
		System.out.printf("이름:%s\n",name);
		System.out.printf("주소:%s\n",addr);
		System.out.printf("전화:%s\n",phone);
		System.out.printf("번호:%s\n",number);
		System.out.printf("마일리지:%.1f\n",mileage);
	}

}

class InhertanceTestCustomerConstuructor02
{
	public static void main(String[] args) 
	{
		Customer c = new Customer("홍길동","서울","010-1234-5678","A1234",1000);
		c.printCustomer();
	}
}

/*
InhertanceTestCustomerConstuructor02.java:34: error: constructor Person in class Person cannot be applied to given types;
        public Customer(String name, String addr, String phone, String number,double mileage){
                                                                                             ^
  required: String,String,String
  found: no arguments
  reason: actual and formal argument lists differ in length
InhertanceTestCustomerConstuructor02.java:39: error: constructor Person in class Person cannot be applied to given types;
        public Customer(){}
                         ^
  required: String,String,String
  found: no arguments
  reason: actual and formal argument lists differ in length
2 errors


자식클래스의 생성자의 첫번째 줄에는 아무런 말을 쓰지 않아도 부모의 기본생성자를 요구하는 super()라는 말이 생략되어있음
위의 클래스에서는 부모클래스인 Person에 기본생성자를 만들지 않았으므로 오류가 발생

필요하다면 자식의 생성자에서 부모의 매개변수를 갖는 생성자를 요구하거나 부모클래스에서 기본생성자를 만들 수 있음


*/