class RangeByte 
{
	public static void main(String[] args) 
	{
		// 1byte�� 8bit�� �����ȴ�.
		// 1bit�� ǥ���� �� �ִ� ���� ������ 0,1 �ΰ��� 
		// 2bit�� �ִٸ�
		//  00   0
		//  01   1
		//  10   2
		//  11   3

		//1byte(8���� bit)�߿� �� ���ʿ� �ִ� bit�� ��ȣ�� �������� ������� 
		//�Ǻ��ϴ� ��ȣ��Ʈ�� ����ϰ�
		//������ 7���� ��Ʈ�� ���ڸ� ǥ���Ѵ�
		//���� ǥ���� �� �ִ� ���� ������ ������ ����
		//���� 2�� 7�� ���� ��� 2�� 7�� -1
		//-128 ~ 127

		byte data;
		data = -128;
		System.out.println(data);
		data = (byte)(data - 1);//underFlow
        System.out.println(data);

		/*data = 127;
		System.out.println(data);
		data = (byte)(data+1);//overFlow
		System.out.println(data);*/

	}
}
/*
C:\javaStudy\day0928>java RangeByte
127
-128
*/