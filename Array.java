import java.util.Scanner;
public class Array {
  public static void main(String arg[]) {
         Scanner sc = new Scanner(System.in);
         System.out.print("enter size of array:");
         int size = sc.nextInt();
         int num[] = new int[size+1];
         
         //input
         for(int i=0; i<size; i++){
             System.out.print("enter element of array:" );
             num[i] = sc.nextInt();
         }
         //output
         for(int i=0; i<num.length; i++){
               System.out.println(num[i]);
              }
              
               System.out.print("enter element to be find:" );
                 int x = sc.nextInt();
         
        for(int i=0; i<num.length; i++){
             if(num[i] == x){
                  System.out.println("X found at imdex:" + i);
             }
     }
              System.out.println("for insert element");
            System.out.print("enter array location:");
                 int y = sc.nextInt();
             System.out.print("enter new element:");
                 int z = sc.nextInt();
                

           
}
}
