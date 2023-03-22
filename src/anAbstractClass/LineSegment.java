package anAbstractClass;

public class LineSegment implements Comparable<LineSegment>{
    private Point coor1, coor2;

    public LineSegment(Point c1, Point c2) {
        coor1 = c1;
        coor2 = c2;
    }

    public Point getCoor1() {
        return coor1;
    }

    public void setCoor1(Point coor1) {
        this.coor1 = coor1;
    }

    public Point getCoor2() {
        return coor2;
    }

    public void setCoor2(Point coor2) {
        this.coor2 = coor2;
    }

    public double length() {
        double squareX = Math.pow(coor1.getX() - coor2.getX(), 2);
        double squareY = Math.pow(coor1.getY() - coor2.getY(), 2);
        return Math.sqrt(squareX + squareY);
    }

    @Override
    public int compareTo(LineSegment other) {
        if (this.length() < other.length()) {
            return -1;
        }
        else if (this.length() > other.length()) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        LineSegment line1 = new LineSegment(new Point(0, 0), new Point(1, 2));
        LineSegment line2 = new LineSegment(new Point(7, 3), new Point(5, 9));
        System.out.println(line1.length());
        System.out.println(line2.length());
        System.out.println(line1.compareTo(line2));
    }
}
