class Student{
	protected String name;
	protected int classof;
	protected int level;
	protected String major;
	protected int credit;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setClassof(int classof){
		this.classof = classof;
	}
	public int getClassof(){
		return classof;
	}
	public void setLevel(int level){
		this.level = level;
	}
	public int getLevel(){
		return level;
	}
	public void setMajor(String major){
		this.major = major;
	}
	public String getMajor(){
		return major;
	}
	public void setCredit(int credit){
		this.credit = credit;
	}
	public int getCredit(){
		return credit;
	}
	public Student(){}

	public Student(String name,int classof, int level,String major, int credit){
		this.name = name;
		this.classof = classof;
		this.level = level;
		this.major = major;
		this.credit = credit;
	}
	public String toString(){
		return "�̸�: "+name+" �й�: "+classof+" �г�: "+level+" �а�: "+major+" �̼� ���� ��: "+credit;
	}
}


class UnderGraduate extends Student{
	private String club;

	public UnderGraduate(){}

	public UnderGraduate(String name,int classof, int level, String major, int credit, String club){
		super(name, classof, level, major, credit);
		this.club = club;
	}
	public void setClub(String club){
		this.club = club;
	}
	public String getClub(){
		return club;
	}
	public String toString(){
		return super.toString()+" ���Ƹ���: "+club;
	}
}

class Graduate extends Student{
	 private String assistant;
	 private double scholar;
	 
	 public Graduate(String name,int classof, int level,String major, int credit, String assistant, double scholar){
		super(name, classof, level, major, credit);
		if(assistant.equals("���� ����")){
		this.assistant = "���� ����";
		}else if(assistant.equals("���� ����")){
		this.assistant = "���� ����"; 
		}
		if(scholar<=1 && scholar>=0){
			this.scholar=scholar;
		}
	 }
	 
	 public void setAssistant(String assistant) {
		 if(assistant.equals("���� ����")){
		this.assistant = "���� ����";
		}else if(assistant.equals("���� ����")){
		this.assistant = "���� ����"; //����
		}
	 }
	 public String getAssistant(){
		 return assistant;
	 }
	 public void setScholar(double scholar){
		 if(scholar<=1 && scholar>=0){
			this.scholar=scholar;
		  }
	 }
	 public double getScholar(){
		 return scholar;
	 }
	 public String toString(){
		return super.toString()+" ��������: "+assistant +" ���б� ����: "+scholar;
	}
}


class StudentPrintInfoTest
{
	public static void main(String[] args) 
	{
		Student s = new Student("ȫ�浿",92,3,"�����а�",24);
		System.out.println(s);
		UnderGraduate u = new UnderGraduate("������",98,2,"�濵�а�",18,"�� ���Ƹ�");
		System.out.println(u);
		Graduate g = new Graduate("������",99,4,"�����а�",20,"���� ����",0.7);
		System.out.println(g);
		g.setScholar(1.2); //�۵�x
		System.out.println(g);

	}
}
