class Person{ //�θ�Ŭ����
	protected String name;
	protected String addr;
	protected String phone;
	public Person(String name,String addr,String phone){
		this.name=name;
		this.addr=addr;
		this.phone=phone;
	}
	//�⺻�����ڰ� ����!!!!!!!!!!!!!!!!!!!!!!

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
class Customer extends Person{ //�ڽ�Ŭ����
	private String number;
	private double mileage;
	public Customer(String name, String addr, String phone, String number,double mileage){//��ӹ޾ұ� ������ �Ű������� 5����
		//�Ű������� ���� �����ڸ� �䱸���� �ʾұ� ������ super();�� �����Ǿ���
		//super()�� �θ�Ŭ������ �⺻�����ڸ� �䱸��! ������ ����! �׷��� ������
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
		System.out.printf("�̸�:%s\n",name);
		System.out.printf("�ּ�:%s\n",addr);
		System.out.printf("��ȭ:%s\n",phone);
		System.out.printf("��ȣ:%s\n",number);
		System.out.printf("���ϸ���:%.1f\n",mileage);
	}

}

class InhertanceTestCustomerConstuructor02
{
	public static void main(String[] args) 
	{
		Customer c = new Customer("ȫ�浿","����","010-1234-5678","A1234",1000);
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


�ڽ�Ŭ������ �������� ù��° �ٿ��� �ƹ��� ���� ���� �ʾƵ� �θ��� �⺻�����ڸ� �䱸�ϴ� super()��� ���� �����Ǿ�����
���� Ŭ���������� �θ�Ŭ������ Person�� �⺻�����ڸ� ������ �ʾ����Ƿ� ������ �߻�

�ʿ��ϴٸ� �ڽ��� �����ڿ��� �θ��� �Ű������� ���� �����ڸ� �䱸�ϰų� �θ�Ŭ�������� �⺻�����ڸ� ���� �� ����


*/