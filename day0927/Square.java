import java.util.Scanner;
class Square{
   public static void main(String []args){
    int a,b,add;
    Scanner sc = new Scanner(System.in);
    System.out.println("가로길이를 입력하세요");
    a = sc.nextInt();
    System.out.println("세로길이를 입력하세요");
    b = sc.nextInt();
    add = a*b;
    System.out.println("사각형의 면적은 " +add+"입니다");
   }
}