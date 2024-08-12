public class ArrayMiss {
    public static void main(String[] args){
        int arr[]={2,4,6,10};
        int f=arr[0];
        int l=arr[arr.length-1];
        for(int i=f;i<l;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(i==arr[j])
                {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println(i);
            }
        }
    }
    
}
