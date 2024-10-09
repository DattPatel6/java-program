
import java.util.Scanner;
public class Calculator{

     public static void main(String []args) { 
         
         Scanner sc = new Scanner(System.in);
         
         String name;
         int age;
         double height;
         
         System.out.println("please enter your Name:");
         name = sc.nextLine();
         
         System.out.println("please ente your Age:");
         age = sc.nextInt();
         
         System.out.println("please enter your Height:");
         height = sc.nextDouble();
         
         System.out.println("YOUR NAME IS :" + name);
          System.out.println("YOUR AGE IS :" + age);
           System.out.println("YOUR HEIGHT IS :" + height);
         
     }
     
}