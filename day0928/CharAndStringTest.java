class CharAndStringTest 
{
	public static void main(String[] args) 
	{
		//�ڹٿ����� ���Ϲ����� ó���� ���ڿ��� ó���� �޶��
		//�ϳ��� ���ڸ� ǥ���ϱ� ���ؼ��� Ȫ����ǥ�� ����� �ϰ�
		//���ڿ��� ó���ϱ� ���ؼ��� �ֵ���ǥ�� ����� �մϴ�. 
		//���� �ϳ��� ���������� �ֵ���ǥ�� �����ٸ� char�� ������ �� ����
		//String���� �����ؾ� �մϴ�. 

		char firstName;
		firstName = '��';
		System.out.println(firstName);

		String name;
		name = "������";
		System.out.println(name);

		//char lastName;
		String lastName;
		lastName = "��";
        System.out.println(lastName);

		String data;
		data = "hello";
		char last = data.charAt(4);
		//charAt�� String�� ��ġ(index)�� �ִ� ���� �ϳ��� �˷��ִ� ����Դϴ�.
		//��ġ(index)�� 0���� �����մϴ�.
		System.out.println("�� �������� �ִ� ���ڴ� "+last+"�Դϴ�");

	
	}
}
/*
C:\javaStudy\day0928>javac CharAndStringTest.java
CharAndStringTest.java:20: error: incompatible types: String cannot be converted to char
                lastName = "��";
                           ^
1 error
*/