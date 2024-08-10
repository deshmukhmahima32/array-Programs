public class Array12 {
    public static void main(String [] args)
    {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int ar1[][]={{10,20,30},{10,20,30},{10,20,30}};
        int arr2[][]=new int[3][3];
        for(int i=0;i<arr.length;i++)

        { for(int j=0;j<arr.length;j++)
            {
                arr2[i][j]=ar1[i][j]*arr[i][j];
                System.out.println("the mul of Both the array is  "+arr2[i][j]);
            }

        }
    }
    
}

    

