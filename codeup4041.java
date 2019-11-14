import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] ar = new int[1000000];
    int n = sc.nextInt();
    int l,i,k,sum=0,a=0,total=0;
    int num = n;
    for(i=0;i<n;i++){
      ar[i] = num%10; total += ar[i];
      if(num>0){ num /= 10; a++; }
      else break;
    }
    for(i=0;i<a;i++){
      for(k=1;k<a-i;k++){ ar[i] = ar[i] * 10; }
      sum += ar[i];
    }
    System.out.print(sum+"\n"+ total);
  }
}
