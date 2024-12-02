public class fabonacci {
    public static void main(String[] args) {
        
        int a=0,b=1;
        int c=0;
        for (int i = 0; i <10; i++) {
            a=b;
            b=c;
            System.out.println(c);
            c=a+b;
              
        }
    }
}
