class Student
{

}
public class ArrayDemo
 {
     public static void main(String args[])
     {
        // int nums[]=new int[5];
         //in java arrays are objects so while declaring an array we use new keyword
         //it is compulsory to declare size of an array
         //we can intialize an array elements in this way
         /*
         nums[0]=0;
         nums[1]=1;
         */
        /*if we already know the values of array elements while declaring
        we directly intialize values at the time of declaring and array
        int nums[]={1,2,3,4,5,6};
        */
        //we can also create an array of objects of a class
        /*
        Student s1=new Student();
        Student s1=new Student();
        Student s3=new Student();
        */
        /*
        Student s[]=new Student[3];
        */
        /*
        Student s[]={s1,s2,s3};
        */
       /* nums[0]=10;
        nums[1]=20;
        nums[2]=30;
        nums[3]=40;
        nums[4]=50;
        for(int i=0;i<5;i++)
        {
            System.out.println(nums[i]);
        }*/
        //2d arrays
       /* int arr[][]={{1,2,3},
        {23,45,67,78,89},
        {2,3,4}
         };
         //when an array rows and colomns are not fixed is known as jagged array
         //the above array is an jagged array
        for(int i=0;i<arr.length;i++)
        //arr.length gives the number of rows
        {
            for(int j=0;j<arr[i].length;j++)
            //arr[i].length gives the number of colomns for that particular row i
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        //Enhanced for loop
        int []a= {1,3,4,5,6,10};
        for(int k:a)
        {
            System.out.println(k);
            //in enhanced for loop the every value of array is going to assign to
            //k from zero to last element index value
        }
        //enhanced for loop for 2d array
        int ar[][]={
            {1,3,4,5},
            {2,3,4,5,6,7},
            {3,4,5},
            {2,3,4,5,6}
        };
        for (int i[]:ar)
        //in case of 2d array the first row itself is an array
        //therefore we used i[] an array to store the row values
        //and from that row we get colomn elements
        {
            for(int j: i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }


        
         
     }
    
}
