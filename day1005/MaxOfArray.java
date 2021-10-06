/*배열중에서 가장 큰 수 찾기
1.가장 큰수를 찾아 저장하기 위한 max라는 변수 선언
2.배열의 맨 첫번째 요소를 일단 max라고 본다
3.반복문을 이용하여 배열은 두번째 요소부터 max에 담긴것을 비교하여 비교하는 배열의 값이 max보다 더 크다면 그 배열의 값을 max라고 본다
*/

class MaxOfArray 
{
	public static void main(String[] args) 
	{
		int []arr = {9,3,7,15,2};
		int max = arr[0];
		for(int i = 1;i<arr.length;i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		System.out.print("배열중에 가장 큰 값은 "+max);
		
	}
}
