class DataTypeTest 
{
	public static void main(String[] args) 
	{
		//byte age;
		//short age;
		//int age;
		long age;
		age = 27;
		System.out.println("김지현의 나이"+age+"살 입니다.");

        
        //double height;
		float height;
		//height = 163.2f;//실수값을 float변수에 저장하기 위해서는 접미사f
		height = (float)163.2;//자료형변환을 하여 저장할 수 있어요 
		System.out.println("김지현의 키"+height);



        char gender;
		gender = 'W';
		//gender = "W";  //쌍따옴표로 묶으면 문자열(String)으로 취급하기 때문에 char에 저장할 수 없어요
		System.out.println("김지현의 성별은"+gender);


        boolean isVaccine;
		isVaccine = true;
		System.out.println("김지현의 1차 백신 접종 여부"+isVaccine);
	}
}
/*
C:\javaStudy\day0928>javac DataTypeTest.java
DataTypeTest.java:15: error: incompatible types: possible lossy conversion from double to float
                height = 163.2;
                         ^
1 error
*/

/*
C:\javaStudy\day0928>javac DataTypeTest.java
DataTypeTest.java:23: error: incompatible types: String cannot be converted to char
                gender = "W";
                         ^
1 error

*/