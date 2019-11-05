import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n,m;
    n = sc.nextInt();
    m = sc.nextInt();
    System.out.print((n+m)/2+"\n"+(n-m)/2);
  }
}

