//�迭�� ��Ұ� �ڵ����� �ʱ�ȭ �ǵ��� Ŭ������ ��������鵵 �ڷ����� ���� ������ 0 �Ǽ��� 0.0
//boolean�� false�� �ڵ����� �ʱ�ȭ��

 class BankAccount{
	int balance; // �ܾ��� ǥ���ϴ� ����
	
	void deposit(int amount){
		balance += amount; 
	}
	void withdraw(int amount){
		if(amount <= balance){
		balance -= amount;
		}else{
			System.out.println("�ܾ��� �����մϴ�");
		}
	}
	public int getBalance(){
		return balance;
	}
	
	public void printBalance(){ //�� void? �Է¾��ؼ�?
		System.out.printf("���� �ܰ�� %d�� �Դϴ�\n",balance);
	}
	//��ȯ���� ���� �޼ҵ带 ��¹��� ȣ�� �Ұ�
	public double addInterest(){
		
		//balance = balance + balance * 0.075;
		//balance = balance * 1.075;
		return balance *= 1.075;
	} 


}


public class BankAccountTest02
{
	public static void main(String[] args) 
	{

		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		
		a1.deposit(100);
		a2.deposit(50);

		a1.withdraw(60); //40
		a2.withdraw(30); //20
		
		System.out.printf("a1�� �ܰ�� %d�Դϴ�\n",a1.getBalance());
		System.out.printf("a2�� �ܰ�� %d�Դϴ�\n",a2.getBalance());

		a1.addInterest();
		a2.addInterest(); //���� �߰�

		a1.printBalance();
		a2.printBalance(); //���� �߰��� ���� �ܾ��� ������!
		
		//�ܰ��� �� ���� �ݾ� ����
		a1.withdraw(100); 
		a2.withdraw(100); 



		
	}
}

/*
class BankAccount is public, should be declared in a file named BankAccount.java
public class BankAccount{

�ϳ��� ���Ͽ� �ΰ��� �̻��� Ŭ������ ������ ������ �ݵ�� ������ �ִ� Ŭ���� �̸����� ���ϸ��� �����ؾ� �ϸ� 
ũ Ŭ�������� public�̾�� ��!
*/