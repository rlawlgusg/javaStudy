class BankAccount{
	private int balance; // �ܾ��� ǥ���ϴ� ����
	
	public void setBalance(int b){
		balance = b;
	}
	
	void deposit(int amount){
		balance = balance + amount; 
	}
	void withdraw(int amount){
		if(balance > 0){
		balance = balance - amount;
		}
	}
	public int getBalance(){
		return balance;
	}
	
	public void printBalance(){ //�� void? �Է¾��ؼ�?
		System.out.printf("���� �ܰ�� %d�� �Դϴ�\n",balance);
	}
	
	public double addInterest(){
		
		return balance + balance*0.075;

	} // ����Ͽ� �߰�??


}


class BankAccountTest
{
	public static void main(String[] args) 
	{

		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		
		a1.setBalance(100);
		a2.setBalance(50);

		a1.withdraw(60); //40
		a2.withdraw(30); //20
		
		System.out.printf("a1�� �ܰ�� %d�Դϴ�\n",a1.getBalance());
		System.out.printf("a2�� �ܰ�� %d�Դϴ�\n",a2.getBalance());

		a1.printBalance();
		a2.printBalance();
		
		System.out.printf("a1�� ���������� �ܰ�� %.1f �Դϴ�\n",a1.addInterest());
		System.out.printf("a2�� ���������� �ܰ�� %.1f �Դϴ�\n",a2.addInterest());






		
	}
}
