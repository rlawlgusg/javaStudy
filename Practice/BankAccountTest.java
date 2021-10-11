class BankAccount{
	private int balance; // 잔액을 표시하는 변수
	
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
	
	public void printBalance(){ //왜 void? 입력안해서?
		System.out.printf("현재 잔고는 %d원 입니다\n",balance);
	}
	
	public double addInterest(){
		
		return balance + balance*0.075;

	} // 계산하여 추가??


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
		
		System.out.printf("a1의 잔고는 %d입니다\n",a1.getBalance());
		System.out.printf("a2의 잔고는 %d입니다\n",a2.getBalance());

		a1.printBalance();
		a2.printBalance();
		
		System.out.printf("a1의 이자포함한 잔고는 %.1f 입니다\n",a1.addInterest());
		System.out.printf("a2의 이자포함한 잔고는 %.1f 입니다\n",a2.addInterest());






		
	}
}
