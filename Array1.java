public class Array1 {
    public static void main(String [] args)
    {
        int arr1[]={12,15,6,21,31};
        int max=arr1[0];
        int sum=arr1[0];
        for(int i=0;i<(arr1.length);i++)
        {
          if(arr1[i]>max){
            max=arr1[i];
          }
          sum=sum+arr1[i];
        }
        System.out.println(sum);
        System.out.println(max);
    }
}
