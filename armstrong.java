import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter:");
        int x=sc.nextInt();
        double len=(int)(Math.log10(x)+1);
        double b=0,sum=0,t=x;
        sc.close();
        while (x>0)
         {b=x%10;
            sum=sum+(Math.pow(b,len));
            x=x/10;
        }if (sum==t) {System.out.println("armstrong");
            
        }else{
            System.out.println("not armstrong");
        }

        
    }
}
