package com.sist.eaxm03;

public class StringBufferTest {

	public static void pro(String str) {
		System.out.println("ó���ϴ� ���ڿ��� "+str+"�Դϴ�");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer data = new StringBuffer("hello");
		data.append("korea");
		System.out.println(data);
		
		//A�� data�� B�� data�� ���� �޸𸮸� ������
		//StringBuffer�� ������ �ٲٴ��� ���ο� �޸𸮸� ������ �ʰ�
		//���� ��ü�� ������ �����
		//���� ���ϴ� ���ڿ� ó������ StringBuffer Ȥ�� StringBuilder��
		//����ϴ� ���� ����!!!!
		
		pro(new String(data));
		//String r = new String(data);
		//pro(r);
		
		//�׷��� ���� �̷��� ó���� StringBuffer�� �Ű������� �����Ͽ�
		//� �޼ҵ带 ����� ������ �ٽ� String���� ��ȯ�ؾ� �ϴ� ��찡 ����
		//���ڿ��� �Ű������� �޾� ó���ϴ� ��κ��� �޼ҵ�� String���� �޵��� �Ǿ��ִ� ���� �Ϲ���!
		
		//pro(data);
		//pro�޼ҵ�� String�� �Ű������� ���� ������ StringBuffer�� ���޺Ұ�
		
		//�̿� ���� � �޼ҵ带 ȣ���ϱ� ���Ͽ� StringBuffer�� String�� �ٲپ�� �ϴ� ��찡 ����
		//�̸� ���Ͽ� String�� ������ �߿� StringBuffer�� �Ű������� ���� �����ڸ� �̿���
	}

}
