public class Array10 {
    public static void main(String [] args)
    {
        int arr[][]=new int[3][3];
        arr[0][0]=20;
        arr[0][1]=30;
        arr[0][2]=40;
        arr[1][0]=50;
        arr[1][1]=60;
        arr[1][2]=70;
        arr[2][0]=80; 
        arr[2][1]=90;
        arr[2][2]=100; 
        for(int i =0;i<arr[0].length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {

            
        System.out.println("The Elemrnt of array is  "+arr[i][j]);
        }
    }
    }

    
    
}
