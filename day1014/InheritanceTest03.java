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
		c.setName("ȫ�浿");
		c.setAddr("����Ư���� ������ ������ 1234");
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

�ƹ��� ��ӹ��� �ڽ�Ŭ������ ������ �θ�Ŭ������ private�������� ������ �� ����
���࿡ ��� Ŭ������ �����Ҷ��� ����� ������ �ΰ� �ְ� ��ӹ��� Ŭ�����鿡�Դ� ������ ����ϰ�
�ܺ��� �ٸ� Ŭ�����鿡�Դ� ������ ������� ���� ����� �ִٸ�
protected�� �Ӵϴ�!

*/