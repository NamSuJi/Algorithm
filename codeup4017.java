import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i,k,x,max=0;
    for(i=n/3;i<=n/2;i++){
      for(k=i;k>=(n-i-k);k--){
        x = n-i-k;
        if(x+k>i&&x<=k&&k<=i) max++;
      }
    }
    System.out.print(max);
  }
}
