class Person{
	protected String name;
	protected String addr;
	protected String phonenumber;//��ӹ��� �ڼ��� ���ٰ����ϰ� ���ִ� ������!

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
		c.setName("ȫ�浿");
		c.setAddr("����Ư���� ������ ������ 1234");
		c.setPhonenumber("010-1234-5678");
		c.setCustomernumber("1234");
		c.setMileage(100);

		c.printCustomer();
	}
}
