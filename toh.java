import java.util.*;
public class toh{
    public static void nw(int n,String s,String h,String d)
    {
       if(n==1)
       {
        System.out.println(+n +"from"+s+"to"+d);
        return;
       }
       nw(n-1,s,d,h);
       System.out.println(+n +"from"+s+"to"+h);
       nw(n-1,h,s,d);

    }

    public static void main(String[] args)
    {
        int i;
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    nw(n,"a","b","c");

}
}
