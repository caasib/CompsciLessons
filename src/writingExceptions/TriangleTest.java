package writingExceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            Triangle t1 = new Triangle(a, b, c);
        }
        catch (InputMismatchException e) {
            System.out.println("The inputs must be integers!");
        }
        catch (NotATriangleException e) {
            e.printStackTrace();
        }
    }
}
