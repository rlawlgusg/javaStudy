class Student{ //����Ŭ���� = �θ�Ŭ����
	private int number;
	public String name;//name�� public�̴ϱ� setter,getter�� ���� �ʿ䰡 ����!

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
class GraduateStudent extends student{//����Ŭ���� = �ڽ�Ŭ����
	public String lab;

	public GraduateStudent(){}
	public GraduateStudent(int number,String name,String lab){
		super(number, name); //superŬ�������� �Ű������� ������ ���� ���� 
		this lab = lab;
	}
	
	public void setLab(String lab){
		this.lab = lab;
	}
	public String getLab(){
		return lab;
	}

}


//UML���� = Ŭ������ ����� ���� �׸��� �׸� 
class excercise04{
	public static void main(String []arg){
		GraduateStudent s = new GraduateStudent();
		s.number = 10;
	}
}