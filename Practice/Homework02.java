import java.util.Scanner;
class Homework02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char a;
		double width, height, radius;
		double rectangle , triangle, circle;

		System.out.println("계산할 도형의 종류를 입력하세요");
		System.out.println("사각형 :R, 삼각형 :T, 원:C");
		a = sc.next().charAt(0);//char의 입력값
		//area = 0; 결과를 하나의 변수로 표현하고 싶다면 초기화 시켜야함!
		//return; >>여기에서 main메소드를 종료합니다 

			if(a != 'R' && a != 'T' && a != 'C'){
				System.out.println("잘못된 입력값 입니다");
			}else{
				if(a == 'R'){
						System.out.println("R:사각형의 면적계산");
						System.out.println("사각형의 가로를 입력하시오");
						width = sc.nextDouble();
						System.out.println("사각형의 세로를 입력하시오");
						height = sc.nextDouble();

						rectangle = width*height;
						System.out.println("사각형의 면적은 "+rectangle+"입니다");
					
					}else if(a == 'T'){
						System.out.println("T:삼각형의 면적계산");
						System.out.println("삼각형의 가로를 입력하시오");
						width = sc.nextDouble();
						System.out.println("삼각형의 세로를 입력하시오");
						height = sc.nextDouble();

						triangle = (width*height)/2;
						System.out.println("삼각형의 면적은 "+triangle+"입니다");

					}else if (a == 'C'){
						System.out.println("C:원의 면적계산");//3.14*반지름*반지름
						System.out.println("원의 반지름을 입력하시오");
						radius = sc.nextDouble();

						circle = radius*radius*3.14;
						System.out.println("삼각형의 면적은 "+circle+"입니다");
					}
				}

		}
	}



	