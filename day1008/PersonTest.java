/*
��� person
     	�Ӽ�  �̸� String name "ȫ�浿"
	        ���� int age 20
	        ���� char gender '��','��'
     	����   �Դ´� void eat(String food)
	         �ܴ� void sleep()

*/

class person{ //person�� ��ü
	String name;
	int age;
	char gender; //�Ӽ��� ����

	void eat(String food){
		//������ ���� 20�� ȫ�浿 ������ �Ծ�� 
		System.out.printf("������ %c�� %d�� %s��(��) %s�� �Ծ��\n",gender,age,name,food);
	}

	void sleep(){
		//������ ���� 20�� ȫ�浿�� ���� �ڰ��־��
		System.out.printf("������ %c�� %d�� %s��(��) ���� �ڰ��־��\n",gender,age,name);
	}
}



class PersonTest
{
	public static void main(String[] args) 
	{
		
		person p; //������ person�� �ڷ���
		p = new person(); //new�� �����϶�� ��!
		p.name = "����ȣ";
		p.age = 26;
		p.gender = '��';
		p.eat("ġ��");
		p.sleep();
		
	}
}

