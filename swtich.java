import java.util.Scanner;
public class tut_4 {
    
    // import java.util.Scanner;
// public class switch {
    public static void main (String[] args)
     {
      Scanner sc =new Scanner(System.in);
    // int n,j,sum=0;
     System.out.println("Enter the value of button");
     int button=sc.nextInt();
     switch (button) {
         case 1:
             System.out.println("hello");
             break;
         case 2:
             System.out.println("h1");
             break;
         case 3:
             System.out.println("hey");
             break;
         case 4:
             System.out.println("wassup");
             break;
     
         default:
         System.out.println("Wrong choice");
             break;
     }

     }}
