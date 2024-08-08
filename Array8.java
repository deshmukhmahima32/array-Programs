 class Student {
    int Roll_No;
    String Name;
    Student( int Roll_No  ,String Name)
    {
        this.Roll_No=Roll_No;
        this.Name=Name;
        System.out.println("Student "+Roll_No+"  "+Name);
    

    }
}
    class DriverA{
        public static void main(String [] args)
        {
            Student arr[]=new Student[5];
            arr[0]=new Student(1,"mahima");
            arr[1]=new Student(2,"Nandani");
            arr[2]=new Student(3,"Kashish");
            arr[3]=new Student(4,"Sourabh");
            arr[4]=new Student(5,"Harshita");
             //for(int i=0;i<arr.length;i++)

            {
              //System.out.println(arr[i]);

            }
    
            
        }
    }

    

