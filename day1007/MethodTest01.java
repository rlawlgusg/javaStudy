//만약 구구단을 출력할 일이 많다면 다음과 같이 몇단을 출력할 것인지 변수로 전달받아 해당하는 
//구구단을 출력하는 메소드를 만들 수 있음
//MyUtil이라는 클래스를 만들고 그 클래스 안에 dan을 매개변수로 전달받아 구구단을 출력하는 gugudan 메소드를 만들어봄

class MyUtil{
	void gugudan(int dan){ //gugudan이 메소드 이름 (int dan)메소드 실행에 필요한 값을 전달받는 변수 = 매개변수
		System.out.printf("***%d단***\n",dan);
		for(int i=1;i<=9;i++){
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	} //메소드 바디 , return생략, return값이 없다! = void , 실제로 메소드가 해야할 일!
}  


class MethodTest01{
	public static void main(String []args){
		MyUtil mu = new MyUtil();
		mu.gugudan(9); 
		//사용하려는 메소드의 매개변수의 자료형과 전달하는 값의 자료형이 일치해야함!
		//사용하려면 메소드의 매개변수의 개수와 호출할때 전달하는 매개변수의 개수가 일치해야함
		//하나의 파일에 두개이상의 클래스를 만들때에는 메인메소드를 포함하는 클래스이름으로 파일명을 저장함
		System.out.println("===========================");
		mu.gugudan(10);
	}
}