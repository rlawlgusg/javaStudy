import java.util.Scanner;
class Employee{
	
	String name;
	String addr;
	int salary;
	String phone;

}



class TestEmployee 
{
	public static void main(String[] args){
		//5���� ����� ������ �����ϱ� ���� �迭�� ����� �Է¹޾� ���..
		Scanner sc = new Scanner(System.in);
		Employee []arr = new Employee[5];
		//�迭 ���� ������ ������
		for(int i=0;i<arr.length;i++){
			arr[i] = new Employee();//��ü ������ ��밡��!!!!!!
			System.out.printf("%d ������ �̸�: ",i+1);
			arr[i].name = sc.next();
			System.out.printf("%d ������ �ּ�: ",i+1);
			arr[i].addr = sc.next();
			System.out.printf("%d ������ ����: ",i+1);
			arr[i].salary = sc.nextInt();
			System.out.printf("%d ������ ��ȭ��ȣ: ",i+1);
			arr[i].phone = sc.next();
		}
		for(int i=0 ; i < arr.length ; i++){
		System.out.printf("%s\t%s\t%d\t%s\n",
			arr[i].name,arr[i].addr,arr[i].salary,arr[i].phone);
		}
	}
  }
