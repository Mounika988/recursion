import java.util.*;
public class cont{
    public static void co(String s,int i,String str)
    {
        int j,k;
        int end=0;
       if(i==s.length())
       {
        return;
       }
       else{
       int start=i;
       for(j=i+1;j<=s.length();j++)
       {
         end=j;
        for(k=start;k<=end;k++)
        {
        str=str+s.charAt(k);
        }
       }
       System.out.println(str);
       co( s,i+1,"");
    }
       /* 
       if(str.charAt(0)==str.charAt(end-1))
       {
System.out.println(str);
       }
       cont( s,i+1,"");
    }
    */
}

    public static void main(String[] args)
    {
        int i=0;
    Scanner sc =new Scanner(System.in);
    String s=sc.next();
 co(s,i,"");

}
}

