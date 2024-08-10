public class Array14  {
    public static void main(String [] args)
    {
        int arr[][]={{1,2,3},{4,4,6},{7,8,9}};
        int  sum=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            { 
              sum=sum+arr[i][j];
             }
        }
            System.out.println("Sum of 2D array elements is  "+sum);
        }
    }


        
    
    

