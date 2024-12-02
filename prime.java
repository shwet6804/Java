import java.util.Scanner;
public class prime{
   public static void main(String arg[]){
      int i,n,c,j;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the n value : ");
      n=sc.nextInt();
      System.out.print("Prime numbers between 1 to 10 are ");
      for(j=2;j<=n;j++){
         c=0;
         for(i=1;i<=j;i++){
            if(j%i==0){
               c++;
            }
         }
         if(c==2)
         System.out.print(j+" ");
      }
   }
}
