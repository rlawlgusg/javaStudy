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
		return "이름: "+name+" 학번: "+classof+" 학년: "+level+" 학과: "+major+" 이수 학점 수: "+credit;
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
		return super.toString()+" 동아리명: "+club;
	}
}

class Graduate extends Student{
	 private String assistant;
	 private double scholar;
	 
	 public Graduate(String name,int classof, int level,String major, int credit, String assistant, double scholar){
		super(name, classof, level, major, credit);
		if(assistant.equals("교육 조교")){
		this.assistant = "교육 조교";
		}else if(assistant.equals("연구 조교")){
		this.assistant = "연구 조교"; 
		}
		if(scholar<=1 && scholar>=0){
			this.scholar=scholar;
		}
	 }
	 
	 public void setAssistant(String assistant) {
		 if(assistant.equals("교육 조교")){
		this.assistant = "교육 조교";
		}else if(assistant.equals("연구 조교")){
		this.assistant = "연구 조교"; //수정
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
		return super.toString()+" 조교유형: "+assistant +" 장학금 비율: "+scholar;
	}
}


class StudentPrintInfoTest
{
	public static void main(String[] args) 
	{
		Student s = new Student("홍길동",92,3,"행정학과",24);
		System.out.println(s);
		UnderGraduate u = new UnderGraduate("유관순",98,2,"경영학과",18,"농구 동아리");
		System.out.println(u);
		Graduate g = new Graduate("김유신",99,4,"국문학과",20,"교육 조교",0.7);
		System.out.println(g);
		g.setScholar(1.2); //작동x
		System.out.println(g);

	}
}
