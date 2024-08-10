public class Array15 
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,3,6,3,3,7};
        int count3=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==3)
             {       
                 count3++;                      
             }       
            
               
        }
    
        System.out.println("yes array contain "+count3+" three's ");
    }
  
} 
        /* Second approch
     Program to if arr contain 3 or not
     for(int i=0;i<arr.length;i++)
     {
     if(arr[i]==3)
     {
        count3++;
     }
    }
    if(count3>0)
    {
        System.out.println("yes array contains 3");
    }
    else
    {
        System.out.println("no array don't contain 3")
    }*/

