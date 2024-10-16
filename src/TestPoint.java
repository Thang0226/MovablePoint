import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3,3);
        System.out.println(p1);
        System.out.println(Arrays.toString(p2.getXY()));

        System.out.println();
        p1.setXY(5, 10);
        p2.setX(5);
        p2.setY(10);
        System.out.println(p1);
        System.out.println(p2);
    }
}
