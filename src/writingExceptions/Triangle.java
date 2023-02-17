package writingExceptions;

public class Triangle {
    int a, b, c;
    //Lots of input "errors" can be handled by logically forcing correct inputs using while loops or if/else statements
    //The below code is better handled by forcing the three sides to form a triangle
    public Triangle(int a, int b, int c) throws NotATriangleException {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            this.a = a;
            this.b = b;
            this.c = c;
            System.out.println("Successfully created");
        }
        else {
            throw new NotATriangleException(a, b, c);
        }
    }

    public int getPerimeter() {
        return a + b + c;
    }
}
