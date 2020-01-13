import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    float half = (float)n/2;
    float k=0, max=0;
    float i;
    for(i=1;i<=half;i++){
      k = half-i;
      if((i*k)>max){
        max = i*k;
      }
    }
    System.out.print((int)max);
  }
}
