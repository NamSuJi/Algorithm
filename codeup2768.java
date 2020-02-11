import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int i, j, n, k;
			k = sc.nextInt();
			n = sc.nextInt();
			long arr[] = new long[n+1]; 
      //배열을 long으로 선언해주지 않으면 int의 범위로는 감당할 수 없어 오류가 난다.
			
			for(i=0;i<k;i++) 
				arr[i] = sc.nextInt(); //k번째 숫자까지 가져온다

			for(i=0;i<n;i++) {
				if(i<k) { //i가 k보다 작다면 arr[k]의 값은 앞의 모든 수를 더해야한다.
					arr[k] += arr[i]%100007; //arr[k] 값은 모든 수를 더함으로써 지정되었다.
				}
				else if(i>k){ //arr[k]는 정해졌기에 i가 k보다 커야한다.
					for(j=1;j<k+1;j++)
						arr[i] += arr[i-j]%100007; 
            //k번째가 몇번이나 반복될지 모르니 for문을 이용해 더해준다.
            //arr[i-j]는 크기가 얼마나 클지 모르니 마지막에 해주던 나머지 출력을 더할 때도 해주었다.
				}
			}
			arr[n-1] = arr[n-1]%100007; //숫자가 커질 수 있으니 100007으로 나눈 나머지를 출력해야한다.
			System.out.print(arr[n-1]);
	}
}
