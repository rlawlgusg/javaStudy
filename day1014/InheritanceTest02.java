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


}

class InheritanceTest02
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();
		c.setName("홍길동");
		c.setAddr("서울특별시 마포구 서교동 1234");
		c.setPhonenumber("010-1234-5678");
		c.setCustomernumber("1234");
		c.setMileage(100);

		System.out.println(c.getName());
		System.out.println(c.getAddr());
		System.out.println(c.getPhonenumber());
		System.out.println(c.getCustomernumber());
		System.out.println(c.getMileage());
	}
}
