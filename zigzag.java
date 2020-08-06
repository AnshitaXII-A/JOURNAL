import java.util.*;
class zigzag
{
    int[][]a=new int[4][4];
    void input()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER ELEMENTS IN A MATRIX");
        for(int i=0;i<4;i++)
        for(int j=0;j<4;j++)
        a[i][j]=sc.nextInt();
    }
    void print()
    {
        int i,j,k,max=6;
        for(i=0;i<=max;i++)
        {
            for(j=0;j<4;j++)
            for(k=0;k<4;k++)
            if((j+k)==i)
            System.out.print(a[j][k]+" ");
            System.out.println();
        }
    }
    public static void main()
    {
        zigzag ob=new zigzag();
        ob.input();
        ob.print();
    }
}