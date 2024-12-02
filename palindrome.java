import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        ;
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int t=x;
        int rem=0,b=0;
        sc.close();
        while (x>0) {
            b=x%10;
            rem=rem*10+b;
            x=x/10;   
        }if (rem==t) {System.out.println("palindrome");
            
        }else{System.out.println("not palindrome");}
        
    }
}
