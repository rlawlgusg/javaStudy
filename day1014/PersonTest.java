class Person{
	String name;
	String addr;
	String phonenumber;
}


class Customer extends Person{
	String customernumber;
	double mileage;
}

class PersonTest
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();
		c.name = "ȫ�浿";
		c.addr = "����Ư���� ������ ������ 1234";
		c.phonenumber = "010-1234-5678";
		c.customernumber = "1234";
		c.mileage = 100;

		System.out.println(c.name);
		System.out.println(c.addr);
		System.out.println(c.phonenumber);
		System.out.println(c.customernumber);
		System.out.println(c.mileage);
	}
}
