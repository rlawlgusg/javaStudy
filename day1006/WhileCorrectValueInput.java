import java.util.Scanner;
class WhileCorrectValueInput
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month;
		
		/*
		int month = -1;
		while(month<1 ||month>12){
			System.out.print("���� �Է��ϼ���: ");
			month = sc.nextInt();
		}
		*/


		/*
		for(;;){
			System.out.print("���� �Է��ϼ���: ");
			month = sc.nextInt();
			if(month>=1 && month<=12){
				break;
			}
		}*/
		/*
		while (true)//��� ���̴�..
		{
			System.out.print("���� �Է��ϼ���: ");
			month = sc.nextInt();
			if(month>=1 && month<=12){//�����ǿ� ������ while���� Ż���ϼ���!
 			break;
			}
		}
		*/

		do{
			System.out.print("���� �Է��ϼ���: ");
			month = sc.nextInt();
		}while(month<1||month>12);//�Է°��� ����� �Ȱ��� �ƴϸ� ��� ����..



		
		String name = "";
		if(month >=3 && month <=5){
			name = "��";
		}else if(month >=6 && month <=9){
			name = "����";
		}else if(month >=9 && month <=11){
			name = "����";
		}else{
			name = "�ܿ�";
		}

		System.out.printf("%d���� %s�Դϴ�",month,name);

	}
}
