class CharAndStringTest 
{
	public static void main(String[] args) 
	{
		//자바에서는 단일문자의 처리와 문자열의 처리가 달라요
		//하나의 문자를 표현하기 위해서는 홋따옴표로 묶어야 하고
		//문자열을 처리하기 위해서는 쌍따옴표로 묶어야 합니다. 
		//만약 하나의 문자이지만 쌍따옴표로 묶었다면 char에 저장할 수 없고
		//String으로 저장해야 합니다. 

		char firstName;
		firstName = '김';
		System.out.println(firstName);

		String name;
		name = "김지현";
		System.out.println(name);

		//char lastName;
		String lastName;
		lastName = "현";
        System.out.println(lastName);

		String data;
		data = "hello";
		char last = data.charAt(4);
		//charAt은 String의 위치(index)에 있는 문자 하나를 알려주는 기능입니다.
		//위치(index)는 0부터 시작합니다.
		System.out.println("맨 마지막에 있는 문자는 "+last+"입니다");

	
	}
}
/*
C:\javaStudy\day0928>javac CharAndStringTest.java
CharAndStringTest.java:20: error: incompatible types: String cannot be converted to char
                lastName = "현";
                           ^
1 error
*/