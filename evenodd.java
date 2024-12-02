import java.util.Scanner;
 class evenodd {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter no. ");
        int x= a.nextInt();
        a.close();


        if (x%2==0) {
            System.out.println("even");
        }else{System.out.println("odd");}
    
}}
