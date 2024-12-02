import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no:");
        int x=sc.nextInt();
        int y=1;
        sc.close();
        for (int i = x; i>0; i--) {
            y=y*i;  
        }System.out.println("fatorial:"+y);
        
    }
}
