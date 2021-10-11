/*
사람 person
     	속성  이름 String name "홍길동"
	        나이 int age 20
	        성별 char gender '남','여'
     	동작   먹는다 void eat(String food)
	         잔다 void sleep()

*/

class person{ //person은 객체
	String name;
	int age;
	char gender; //속성들 나열

	void eat(String food){
		//성별이 남인 20살 홍길동 우유를 먹어요 
		System.out.printf("성별이 %c인 %d살 %s가(이) %s를 먹어요\n",gender,age,name,food);
	}

	void sleep(){
		//성별이 남인 20살 홍길동이 쿨쿨 자고있어요
		System.out.printf("성별이 %c인 %d살 %s가(이) 쿨쿨 자고있어요\n",gender,age,name);
	}
}



class PersonTest
{
	public static void main(String[] args) 
	{
		
		person p; //변수명 person이 자료형
		p = new person(); //new는 생성하라는 뜻!
		p.name = "최현호";
		p.age = 26;
		p.gender = '남';
		p.eat("치맥");
		p.sleep();
		
	}
}

