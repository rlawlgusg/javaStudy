import java.util.Scanner;
class Lab01 
{
	public static void main(String[] args) 
	{
		int score;
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		/*
		printf���� f�� ����! ������ ������ ������ �����ؼ� ����ϰ��� �Ҷ�
		���� �������� %s,data >>data�� S(���ڿ�) ���Ŀ� ���缭 ���ּ���..��¶�
		%s = string , %f , %d
		ĭ�� ����.. 10ĭ�� �������� %10s
		*/
		score = input.nextInt();

		/*if(score >= 60){
			System.out.println("�հ�!");
			System.out.println("�����մϴ�.");
		}else
			System.out.println("���հ�!");
		System.out,println("����");	*/
		//�ؾ��� ����� �ϳ��� �߰�ȣ ���� ����! �鿩���� ����� �� ǥ���ؾ��Ѵ�
	
	
	/* ���׿����� ? ��� (���ǽ�)?:��:����;
	����1
	String result = (score >= 60)? "�հ�!": "���հ�!";
	System.out.println(result); 
	����2
	System.out.println((score >= 60)? "�հ�!": "���հ�!"); */
	*/


		if(score>=80){
			System.out.println("���� ����ϰ� �հ��Ͽ����ϴ�.");
		}else{//80�̸�..
			if(score>=70){
				System.out.println("����ϰ� �հ��Ͽ����ϴ�");
			}else//70�̸�{
				if (score>=60){
					System.out.println("�հ��Դϴ�");
				}else{//60�̸�
					if (score>=50){
						System.out.println("��Ÿ���� ���հ�!");
					}else{
						System.out.println("���հ�!");
					}

				}
			}
		
		/*

		if(score<50){
			System.out.println("���հ� �Դϴ�");
		}else if(score<60){
			System.out.println("��Ÿ���� ���հ��Դϴ�");
		}else if(score<70){
			System.out.println("�հ� �Դϴ�");
		}else if(score<80){
		System.out.println("����ϰ� �հ��Ͽ����ϴ�");
		}else{
		System.out.println("���� ����ϰ� �հ��Ͽ����ϴ�"); 
		}

		*/






	}
}
