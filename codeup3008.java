import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] height = new int[9];
    int i,k;
    int sum=0;
    int f1=0,f2=0;

    for(i=0;i<9;i++){
      height[i] = scan.nextInt();
      sum += height[i];
    }
    Arrays.sort(height);

    for(i=0;i<9;i++){
      for(k=0;k<9;k++){
        if(i != k){
          if((sum-(height[i]+height[k]))==100){
            f1 = i;
            f2 = k;
            break;
          }
        }
      }
    }
    for(i=0;i<9;i++)
      if(i!=f1 && i!=f2)
        System.out.println(height[i]);
  }
}
