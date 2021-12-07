import java.util.Scanner;
  class linear_search
 {
     public static void main (String[] args)
     {
      Scanner sc =new Scanner(System.in);
    int n,j;
    int[] array=new int[10];
     System.out.println("Enter the value of 10 numbers");
     for(j=0;j<10;j++)
     {
         array[j]=sc.nextInt();
     }
     System.out.println("Enter no. to be searched in the list");
     n=sc. nextInt();
     for(j=0;j<10;j++)
     {
         if(array[j]==n){
         System.out.println("Number "+n+"found at index "+j);
         break;
     }    
     else
         {
             continue;
         }
        }

   
 }}
