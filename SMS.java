import java.util.*;
class SMS
{
    String str,keys;
    SMS()
    {
        str="";
        keys="";
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER MESSAGE");
        str=sc.nextLine();
    }
    void getkey()
    {
        int[] k={2,22,222,3,33,333,4,44,444,5,55,555,6,66,666,7,77,777,7777,8,88,888,9,99,999,999};
        str=str.toLowerCase();
        int i;
        for(i=0;i<str.length();i++)
        {char ch=str.charAt(i);
            if(ch==' ')
            keys=keys+"0";
            else
            {
                int a=(int) ch-97;
                keys=keys+k[a];
            }
        }
    }
    void frequency ()
    {
        int i,c,l=keys.length(),j;
        System.out.println("KEY"+"\t"+"FREQUENCY");
        for(i=0;i<10;i++)
        {
            c=0;
            for(j=0;j<l;j++)
            {
                int n=Integer.valueOf(keys.charAt(j));
               if((n-48)==i)
               c++;
            }
            if(c>0)
            System.out.println(i+ "\t"+c);
        }
    }
    void display()
    {
        System.out.println("MESSAGE: "+str);
        System.out.println("KEYS: " +keys);
    }
    public static void main()
    {
        SMS ob=new SMS();
        ob.input();
        ob.getkey();
        ob.display();
        ob.frequency();
    }
}