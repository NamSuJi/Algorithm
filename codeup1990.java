import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char[] ch = str.toCharArray();
    int i,sum=0;
    for(i=0;i<ch.length;i++){
      sum += (int)ch[i];
    }
    if(sum%3==0) System.out.print("1");
    else System.out.print("0");
  }
}
