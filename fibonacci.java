
import java.util.Scanner;


public class FibonacciRecursive {

 
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; 
        }
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        System.out.println("RESULT " + n );
        
       
            System.out.print(fibonacci(n));
        

        
    }
}
