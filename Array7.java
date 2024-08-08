class Array7{
    public static void main(String []args)
    {
        float marks[]={22.4f,66.5f,55.2f,77.7f};
        float sum=0;
        for(float element:marks)
        {
            sum=sum+element;
        }
        System.out.println("The sum of array element is =  "+sum);
    }
}