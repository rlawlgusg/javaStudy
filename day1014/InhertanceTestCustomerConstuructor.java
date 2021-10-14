class Person{
	protected String name;
	protected String addr;
	protected String phone;
	public Person(String name,String addr,String phone){
		this.name=name;
		this.addr=addr;
		this.phone=phone;
	}
	public Person(){}

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
class Customer extends Person{
	private String number;
	private double mileage;
	public Customer(String name, String addr, String phone, String number,double mileage){
		super(name,addr,phone);//매개변수를 갖는 생성자를 부모에게 요구한다
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
