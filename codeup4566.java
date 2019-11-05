import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n,m,sum=0,com1=0,com2=0,min=10000;
    int i,k;
    n = sc.nextInt();
    m = sc.nextInt();
    for(i=n;i<m+1;i++){
      for(k=i;k>0;k--){
        if(i%k==0) com1++;
      }
      if(com1==2){
        sum+=i;
        if(i<min) min=i;
      }else if(com1==0) com2++;
      com1=0;
    }
    if(com2==(m-n)) System.out.print("-1");
    else System.out.print(sum+"\n"+min);
  }
}
