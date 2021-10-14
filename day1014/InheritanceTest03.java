class Person{
	private String name;
	private String addr;
	private String phonenumber;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAddr(String addr){
		this.addr = addr;
	}
	public String getAddr(){
		return addr;
	}
	public void setPhonenumber(String phonenumber){
		this.phonenumber = phonenumber;
	}
	public String getPhonenumber(){
		return phonenumber;
	}

}


class Customer extends Person{
	private String customernumber;
	private double mileage;

	public void setCustomernumber(String customernumber){
		this.customernumber = customernumber;
	}
	public String getCustomernumber(){
		return customernumber;
	}
	public void setMileage(double mileage){
		this.mileage = mileage;
	}
	public double getMileage(){
		return mileage;
	}
	public void printCustomer(){
	System.out.println(name);
	System.out.println(addr);
	System.out.println(phonenumber);
	System.out.println(customernumber);
	System.out.println(mileage);
	}
}

class InheritanceTest03
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();
		c.setName("홍길동");
		c.setAddr("서울특별시 마포구 서교동 1234");
		c.setPhonenumber("010-1234-5678");
		c.setCustomernumber("1234");
		c.setMileage(100);

		c.printCustomer();
	}
}
/*
InheritanceTest03.java:45: error: name has private access in Person
        System.out.println(name);
                           ^
InheritanceTest03.java:46: error: addr has private access in Person
        System.out.println(addr);
                           ^
InheritanceTest03.java:47: error: phonenumber has private access in Person
        System.out.println(phonenumber);
                           ^
3 errors

아무리 상속받은 자식클래스라 할지라도 부모클래스의 private영역에는 접근할 수 없음
만약에 어떠한 클래스를 설계할때에 상속을 염두해 두고 있고 상속받은 클래스들에게는 접근을 허용하고
외부의 다른 클래스들에게는 접근을 허용하지 않을 멤버가 있다면
protected에 둡니다!

*/