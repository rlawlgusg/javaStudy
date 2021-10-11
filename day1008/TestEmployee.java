import java.util.Scanner;
class Employee{
	
	String name;
	String addr;
	int salary;
	String phone;

}



class TestEmployee 
{
	public static void main(String[] args){
		//5명의 사원의 정보를 저장하기 위한 배열을 만들고 입력받아 출력..
		Scanner sc = new Scanner(System.in);
		Employee []arr = new Employee[5];
		//배열 참조 변수를 선언함
		for(int i=0;i<arr.length;i++){
			arr[i] = new Employee();//객체 생성후 사용가능!!!!!!
			System.out.printf("%d 직원의 이름: ",i+1);
			arr[i].name = sc.next();
			System.out.printf("%d 직원의 주소: ",i+1);
			arr[i].addr = sc.next();
			System.out.printf("%d 직원의 연봉: ",i+1);
			arr[i].salary = sc.nextInt();
			System.out.printf("%d 직원의 전화번호: ",i+1);
			arr[i].phone = sc.next();
		}
		for(int i=0 ; i < arr.length ; i++){
		System.out.printf("%s\t%s\t%d\t%s\n",
			arr[i].name,arr[i].addr,arr[i].salary,arr[i].phone);
		}
	}
  }
