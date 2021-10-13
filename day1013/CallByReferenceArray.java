/*
메소드 호출시에 배열참조변수나 객체참조변수가 전달되는 경우를 참조에 의한 호출이라고 하고,
메소드 호출시에 전달해준 내용이 메소드 안에서 변경될 때에 호출한쪽에도 적용이 된다
*/


class CallByReferenceArray //참조에 의한 호출(배열)
{
	//정수형 배열을 매개변수로 전달받아 배열의 모든 요소를 출력하는 메소드를 정의
	public static void PrintArray(int []arr){
		for(int i=0 ; i<arr.length ; i++){
			System.out.printf("%5d",arr[i]);
		}
		System.out.println();
	}

	//정수형 배열을 매개변수로 전달받아 배열의 모든 요소를 1씩 증가하는 메소드를 정의
	public static void PlusOne(int []arr){
		for(int i=0 ; i<arr.length ; i++){
			arr[i] = arr[i] + 1;
		}
	}

	public static void main(String[] args) 
	{
		int []arr = {10,20,30};//배열이 이름이 메소드랑 같아도 달라도 상관 없다
		PrintArray(arr);//arr은 참조변수!! 
		PlusOne(arr);
		PrintArray(arr);
		
	}
}
