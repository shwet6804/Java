import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter 1st no:");
        int x =obj.nextInt();
        System.out.println("enter second no:");
        int y=obj.nextInt();
        System.out.println("maximum is:"+Math.max(x,y));
        obj.close();
    }
}
