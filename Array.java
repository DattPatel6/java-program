import java.util.Scanner;
public class Array {
  public static void main(String arg[]) {
         Scanner sc = new Scanner(System.in);
         System.out.print("enter size of array:");
         int size = sc.nextInt();
         int num[] = new int[size];
         
         //input
         for(int i=0; i<size; i++){
             System.out.print("enter element of array:" );
             num[i] = sc.nextInt();
          
         }
         //searching of elememt
            System.out.print("enter element to be find:" );
         int x = sc.nextInt();

         //output
         for(int i=0; i<num.length; i++){
             if(num[i] == x){
                  System.out.println("X found at imdex:" + i);
             }
            
         }
     }
}
