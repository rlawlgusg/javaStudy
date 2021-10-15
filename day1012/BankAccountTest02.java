//배열의 요소가 자동으로 초기화 되듯이 클래스의 멤버변수들도 자료형에 따라 정수는 0 실수는 0.0
//boolean은 false로 자동으로 초기화됌

 class BankAccount{
	int balance; // 잔액을 표시하는 변수
	
	void deposit(int amount){
		balance += amount; 
	}
	void withdraw(int amount){
		if(amount <= balance){
		balance -= amount;
		}else{
			System.out.println("잔액이 부족합니다");
		}
	}
	public int getBalance(){
		return balance;
	}
	
	public void printBalance(){ //왜 void? 입력안해서?
		System.out.printf("현재 잔고는 %d원 입니다\n",balance);
	}
	//반환값이 없는 메소드를 출력문에 호출 불가
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
		
		System.out.printf("a1의 잔고는 %d입니다\n",a1.getBalance());
		System.out.printf("a2의 잔고는 %d입니다\n",a2.getBalance());

		a1.addInterest();
		a2.addInterest(); //이자 추가

		a1.printBalance();
		a2.printBalance(); //이자 추가된 현재 잔액을 보여줌!
		
		//잔고보다 더 많은 금액 인출
		a1.withdraw(100); 
		a2.withdraw(100); 



		
	}
}

/*
class BankAccount is public, should be declared in a file named BankAccount.java
public class BankAccount{

하나의 파일에 두개의 이상의 클래스로 구성될 때에는 반드시 메인이 있는 클래스 이름으로 파일명을 저장해야 하며 
크 클래스만이 public이어야 함!
*/