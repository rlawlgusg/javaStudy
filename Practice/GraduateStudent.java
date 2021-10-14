class Student{ //수퍼클래스?
	private int number;
	public String name;

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
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

}
public class GraduateStudent extends student{//서브클래스?
	public String lab;

	public GraduateStudent(){}
	public GraduateStudent(int number,String name,String lab){
		super(number, name);
		this lab = lab;
	}
	
	public void setLab(String lab){
		this.lab = lab;
	}
	public String getLab(){
		return lab;
	}

}