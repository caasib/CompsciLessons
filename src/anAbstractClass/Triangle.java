package anAbstractClass;

public class Triangle <T extends Number> implements Comparable<Triangle<T>> {
    private T side1, side2, side3;

    public Triangle(T side1, T side2, T side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public <T extends Number> Number getPerimeter() {
        if (side1 instanceof Double || side2 instanceof Double || side3 instanceof Double) {
            return (side1.doubleValue() + side2.doubleValue() + side3.doubleValue());
        }
        else {
            return (side1.intValue() + side2.intValue() + side3.intValue());
        }
    }

    @Override
    public int compareTo(Triangle<T> other) {
        if (getPerimeter().doubleValue() > other.getPerimeter().doubleValue()) {
            return 1;
        }
        else if (getPerimeter().doubleValue() < other.getPerimeter().doubleValue()) {
            return -1;
        }
        return 0;
    }
}
