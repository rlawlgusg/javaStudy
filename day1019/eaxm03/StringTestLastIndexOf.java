package com.sist.eaxm03;

public class StringTestLastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = new String("https://docs.oracle.com/javase/8/docs/api/index.html");
		//���� url�� ���� �ǳ��� �ִ� "/"�� �ε����� ã�� ���
		
		int index = url.lastIndexOf("/");
		System.out.println(index);
	
	}

}
