import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n,m,sum=0,min=10000;
    int i,k;
    n = sc.nextInt();
    m = sc.nextInt();
    for(i=n;i<m+1;i++){
      for(k=1;k<=i;k++){
        if(i/k==k&&i%k==0){
          sum+=i;
          if(i<min) min = i;
        }
      }
    }
    System.out.print(sum+"\n"+min);
  }
}
