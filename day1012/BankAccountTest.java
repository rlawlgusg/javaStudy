class BankAccount{
	private String name;
	private String account;
	private int balance;
	private double interest;

	public String toString(){
		return name+"���� ���¹�ȣ "+account+"�� �ִ� �ܾ��� "+balance+"�̸� �������� "+interest+"�Դϴ�";
	}


	public BankAccount(){
		name = "ȫ�浿";
		account = "1234-567-890";
		balance = 10000;
		interest = 0.075;
	}
	
	public BankAccount(String name, String account, int balance, double interest){
		this.name = name;
		this.account = account;
		this.balance = balance;
		this.interest = interest;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	public void setAccount(String account){
		this.account = account;
	}
	
	public String getAccount(){
		return account;
	}
	public void setBalance(int balance){
		this.balance = balance;
	}
	
	public int getBalance(){
		return balance;
	}
	public void setInterest(double interest){
		this.interest = interest;
	}
	
	public double getInterest(){
		return interest;
	}

}

class BankAccountTest 
{
	public static void main(String[] args) 
	{	
		BankAccount b1 = new BankAccount();
		System.out.println(b1);
		BankAccount b2 = new BankAccount("������","2345-678-543",40000,0.1);
		System.out.println(b2);
		b2.setInterest(0.09);
		System.out.println(b2);

	
	
	}
}
