import java.util.Scanner;
class Month
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		String name = "";
		int m ;
		/*������ ���� ���� 
		�ڹٰ� �Ǵ��ϱ⿡ ������� �Է°��� ���� if���ǽ��� �ϳ��� �������� ������ 
		name�� ���� �ʱ�ȭ ���� ���� �� �־�� 
		name�� ���� �ʱ�ȭ ���� �ʴ� ���¿��� ����� �� �� ���ٴ� �����Դϴ�
		�׷��� ������ ���ڿ� ������ ���鶧���� �ʱⰪ ""�� �ݴϴ�!*/

		System.out.print("������� �Է��ϼ���: ");
		m = sc.nextInt();
		
		if(m >= 3 && m <= 5){
			name = "��";
		}else if(m >= 6 && m <= 8){
			name = "����";
		}else if(m >= 9 && m <= 11){
			name = "����";
		}else if(m == 1 || m == 2 || m ==12 ){
            name = "����";
		}
            System.out.println(m+"���� "+name+"�Դϴ�");
	}
}

