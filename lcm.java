 import java.util.Scanner;
 public class lcm{
    public static void main(String[] args) {
      Scanner x=new Scanner(System.in);
      System.out.println("enter your numbers:");
      int a=x.nextInt();
      int b=x.nextInt();
      int y;
      y= (a > b) ? a : b;
      while(true) {
        if( y% a == 0 && y% b == 0 ) {
          System.out.printf("The LCM of %d and %d is %d.", a, b,y);
          break;
        }
        ++y;
      }x.close();
    }
 } 
