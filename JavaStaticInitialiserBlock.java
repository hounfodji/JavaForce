import java.util.Scanner;

public class JavaStaticInitialiserBlock {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the parallelogram's breadth: ");
        int breadth = scan.nextInt();
        System.out.print("Enter the parallelogram's height: ");
        int heigth = scan.nextInt();
        if(breadth<0 || heigth<0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            if(breadth<=100 && heigth<=100) {
                int area = breadth*heigth;
                System.out.printf("The parallelogram's area is: %d.", area);
            }
        }
       
        scan.close();
   }
}