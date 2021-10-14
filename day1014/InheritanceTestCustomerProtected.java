class Person{
	protected String name;
	protected String addr;
	protected String phonenumber;//상속받은 자손이 접근가능하게 해주는 접근자!

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

class InheritanceTestCustomerProtected
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
