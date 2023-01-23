import java.util.*;
public class ntow{
    public static void nw(int n)
    {
        String dig[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(n==0)
        {
            return;
        }
        int lastdigit=n%10;
        nw(n/10);
        System.out.print(dig[lastdigit]);

    }

    public static void main(String[] args)
    {
        int i;
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(n);
    nw(n);

}
}
