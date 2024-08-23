import java.util.Scanner;
public class ArrayMultiply2 {
    public static void main(String []args)
    {
        int a1[][]=new int[2][2];
        int a2[][]=new int[2][2];
        int a3[][]=new int[2][2];
    
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Frist array element");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter second array elements");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a3[i][j]=0;
                for(int k=0;k<2;k++)
                {
                    a3[i][j]=a3[i][j]+(a1[i][k]*a2[k][j]);
                }
            }
       }
       for(int i=0;i<2;i++)
       {
           for(int j=0;j<2;j++)
           {
               System.out.print(a3[i][j]+"\t");
           }
           System.out.println(" ");
           
       }
}
}

