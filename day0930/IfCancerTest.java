import java.util.Scanner;
import java.util.Date; //date구할때 추가
class IfCancerTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name;
		String items ="";
		Date today = new Date();
		int age,useryear,thisyear;
        thisyear = today.getYear()+1900;
		System.out.print("이름을 입력하세요: ");
		name = input.next();
        System.out.print("출생연도를 입력하세요: ");
		useryear = input.nextInt();
        age = thisyear - useryear;
		System.out.println(name+"님 올해에"+age+"살 입니다");
		if  (age >= 40 && thisyear%2 == useryear%2){
			items = "위암,간암";
		}if (age >= 50){
			items = items + "대장암";
		    System.out.println(name+"님의 암검진 항목은 "+items+"입니다");
		}else{
			System.out.println(name+"님은 검진 대상자가 아닙니다");
		}
	}
}
