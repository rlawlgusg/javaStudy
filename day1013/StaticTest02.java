class Family{
	
	public String name;
	private int age;
	private String role;

	public static String addr; 
	//클래스 변수!! 공통적일때.. 하면 대부분 public, static이기때문에 객체를 사용하지 않고 접근
	
	public Family(String name, int age, String role){
		this.name = name;
		this.age = age;
		this.role = role;
	}

	public Family(){	
	}//습관적으로 기본생성자를 만들어주어야 한다!

	public String toString(){
		return "[name: "+name+" age: "+age+" role :"+role+" addr :"+addr+"]";
	}
	
	public static void pro(){ //반환값이 없으니 void 
		System.out.println("주소: "+ addr);
	}

}


class StaticTest02
{
	public static void main(String[] args) 
	{
		Family.addr = "서울시 마포구 서교동 1234";//객체 생성하지 않아도 쓸 수 있음 클래스변수니까
		System.out.println("주소: "+ Family.addr);
		
		Family.pro();//static 메소드 호출 
		Family.toString();//에러 
		
	}
}

/*
StaticTest02.java:38: error: non-static method toString() cannot be referenced from a static context
                Family.toString();

static메소드가 아닌것은 클래스 이름으로 사용할 수 없어요!
*/