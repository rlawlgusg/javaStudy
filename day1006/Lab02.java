import java.io.IOException;//io ����� IOExeption ����ó��
class Lab02 
{
	public static void main(String[] args) throws IOException{ //�ý��� �ϰ� �˾Ƽ� ����ó����
		String s;
		System.out.println("���ڸ� �Է��Ͻÿ�.: ");
		char c = (char)System.in.read();//�Է¹޴±�� read ���������� ������ ��ȯ

		switch(c)//���ڳ� ���� ���ڿ��� �ü��ִ� ������ �������°� �Ϲ���
		{
			case 'a': case 'e': case 'i': case'u': case'o':
			case 'A' : case 'E' : case 'I' : case 'U' : case 'O':
				System.out.printf("�Էµ� ���� %c�� �����Դϴ�", c); break;
			default : 
				System.out.print("�Էµ� ���ڴ� ������ �ƴմϴ�");break;
		}
	
	/*
	if(c =='a'|| c =='e' || c == 'i' || c=='u' || c =='o'){
		System.out.print("�Էµ� ���ڴ� %c�� �����Դϴ�", c );
	}else
		System.out.print("�Էµ� ���ڴ� %c�� ������ �ƴմϴ�", c );
	
	*/
	
	
	}
}
