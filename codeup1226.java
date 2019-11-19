import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[7];
    int[] b = new int[6];
    int i,k,sum=0,v=0;
    for(i=0;i<7;i++)  a[i] = sc.nextInt();
    for(i=0;i<6;i++)  b[i] = sc.nextInt();

    for(i=0;i<7;i++){
      for(k=0;k<6;k++){
        if(i!=6){ if(a[i]==b[k]) sum++; }
        else if(a[i]==b[k]) v++; 
      }
    }
    if(sum==6) System.out.print("1");
    else if(sum==5&&v==1) System.out.print("2");
    else if(sum==5) System.out.print("3");
    else if(sum==4) System.out.print("4");
    else if(sum==3) System.out.print("5");
    else if(sum<3) System.out.print("0");
  }
}
