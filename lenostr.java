import java.nio.file.WatchService;
import java.util.*;
public class lenostr{
    public static int len(String s)
    {
        if(s.length()==0)
        {
            return 0;
        }
        return len(s.substring(1))+1;

    }

    public static void main(String[] args)
    {
        int i=0;
    Scanner sc =new Scanner(System.in);
    String s=sc.next();
 System.out.print(len(s));.
 WatchService


}
}
