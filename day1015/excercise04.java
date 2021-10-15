class Student{ //수퍼클래스 = 부모클래스
	private int number;
	public String name;//name이 public이니까 setter,getter을 만들 필요가 없음!

	public Student(){}
	public Student(int number, String name){
		this.number = number;
		this.name = name;
	}
	
	public void setNumber(int number){
		this.number= number;
	}
	public int getNumber(){
		return number;
	}
}
class GraduateStudent extends Student{
	public String lab;

	public GraduateStudent(){}
	public GraduateStudent(int number,String name,String lab){
		super(number, name); //super클래스에서 매개변수를 정의할 수도 있음 
		this.lab = lab;
	}
	
	public void setLab(String lab){
		this.lab = lab;
	}
	public String getLab(){
		return lab;
	}

}


//UML도형 = 클래스를 만들기 전에 그리는 그림 
class excercise04{
	public static void main(String []arg){
		GraduateStudent s = new GraduateStudent();
		s.number = 10;
}

/*
s.number = 10;

excercise04.java:41: error: number has private access in Student
                s.number = 10;
                 ^
부모클래스의 private영역에는 자식클래스가 접근 불가능
접근하기 위해서는 setter,getter을쓰거나 부모클래스에서 protected로 접근자를 변경함
1 error
*/