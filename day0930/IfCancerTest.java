import java.util.Scanner;
import java.util.Date; //date���Ҷ� �߰�
class IfCancerTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name;
		String items ="";
		Date today = new Date();
		int age,useryear,thisyear;
        thisyear = today.getYear()+1900;
		System.out.print("�̸��� �Է��ϼ���: ");
		name = input.next();
        System.out.print("��������� �Է��ϼ���: ");
		useryear = input.nextInt();
        age = thisyear - useryear;
		System.out.println(name+"�� ���ؿ�"+age+"�� �Դϴ�");
		if  (age >= 40 && thisyear%2 == useryear%2){
			items = "����,����";
		}if (age >= 50){
			items = items + "�����";
		    System.out.println(name+"���� �ϰ��� �׸��� "+items+"�Դϴ�");
		}else{
			System.out.println(name+"���� ���� ����ڰ� �ƴմϴ�");
		}
	}
}
