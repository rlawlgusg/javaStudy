import java.util.Scanner;
class PrimeNumberTest03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		boolean flag = true;
		System.out.print("N�� �Է��ϼ���: ");
		n = sc.nextInt();
		
		for(int i=2 ; i<n ; i++){
			if(n % i == 0){
			flag = false; //���� n�� ���� 100�̶�� i�� 2�� �� ���ǽ��� �����Ͽ� flag�� false�� �ȴ�
			break;        //���� i�� �������� 3,4...�϶� �Ǻ��� �ʿ䰡 ����......flag�� false�� ��� ����
			}             //�ݺ����� Ż���ϵ����ϴ°� ���ڴ�!
		}		
				if(flag == true){ 
				System.out.println(n+"�� �Ҽ� �Դϴ�");
				}else{
				System.out.print(n+"�� �Ҽ��� �ƴմϴ�");
		}
	}
	}
