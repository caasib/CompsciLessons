package writingExceptions;

public class NotATriangleException extends Exception {
    private int a, b, c;
    public NotATriangleException(int a, int b, int c) {
        super(a + " " + b + " " + c + " violates the Triangle Inequality Theorem");
    }
}
