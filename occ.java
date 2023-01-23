import java.util.*;
public class ass1{
    class COMPLEX{
        void sum(int a,int b,int c,int d)
        {
            System.out.println(a+b+"+i"+c+d);
        }
        void diff(int a,int b,int c,int d)
        {
            System.out.println((a-b)+"+i"+(c-d));
        }
        void mult(int a,int b,int c,int d)
        {
            System.out.println((a*b)+"+i"+(c*d));
        }
    }

    public static void main(String[] args)
    {
        int i;
    Scanner sc =new Scanner(System.in);

COMPLEX operation=new COMPLEX();
String num1=next();
String num2=next();
int a=sc.nextInt();
int c=sc.nextInt();
int b=sc.nextInt();
int d=sc.nextInt();
operation.sum( a, b, c, d);
operation.diff( a, b, c, d);
operation.mult( a, b, c, d);
    }
}