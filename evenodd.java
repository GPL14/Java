import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong(); 
        if (n%2==0) {
            System.out.println("even");
        
        }
        else{
            System.out.println("odd");
        }
        scanner.close();
    }
}
