import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {
      //입력을 위한 선언, sc는 명칭일뿐이니 마음대로 지칭해도 된다. ex)scan
			Scanner sc = new Scanner(System.in); 
	
			int n = sc.nextInt(); //n번째 숫자를 입력 받음
 			int arr[] = new int[n+1]; //n개의 크기가 필요하니 n+1로 크기를 지정해준다
			
			arr[0] = arr[1] = 1; //피보나치 수열에서 첫번째와 두번째 수는 1로 지정이 되어 있음
			
      //반복문은 arr[0],arr[1]의 수가 지정되어 있으니 2번째부터 시작한다.
			for(int i=2;i<n;i++) { 
				arr[i] = arr[i-1] + arr[i-2]; //피보나치 수열의 원리 = i번째 수는 i-1번째 수와 i-2번째 수를 더한 값이다.
			}
			System.out.print(arr[n-1]); //출력
	}
}
