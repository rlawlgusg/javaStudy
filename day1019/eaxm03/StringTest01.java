package com.sist.eaxm03;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = new String("�ȳ��ϼ���");
		String data2 = "�ȳ��ϼ���";
		System.out.println(data);
		System.out.println(data2);
		
		byte[]arr = data.getBytes();
		for(byte b :arr) {
			System.out.println(b);
		}
		
		String result = new String(arr);
		System.out.println(result);
		//��Ʈ��ũ ����̳� ���Ϸ� �ڷḦ ������ �� ���ڿ� �����͸� byte������ ��ȯ�Ͽ� ������
		//���۹��� byte���� �迭�� �ٽ� String���� ����� ���ؼ� byte�迭�� �Ű������� ���� 
		//String�� �����ڸ� �̿��� 
		//�׸��� String �����͸� byte���� ��ȯ�ϱ� ���ؼ� getBytes()�޼ҵ带 �̿���
		
	}

}
