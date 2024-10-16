import java.util.Arrays;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint();
        MovablePoint p2 = new MovablePoint(5, 5, 1, 2);
        System.out.println("-----Before moving-----\nInformation of point 1: ");
        System.out.println(p1);
        System.out.println("Information of point 2: ");
        System.out.println(Arrays.toString(p2.getXY()) + ", speed = "
                + Arrays.toString(p2.getSpeed()));

        System.out.println();
        p1.setXY(7, 9);
        p1.setSpeed(1, 2);
        Point p3 = p2.move();
        p2.move();

        System.out.println("-----After moving-----");
        System.out.println("Information of point 1:");
        System.out.println(p1);
        System.out.println("Information of point 2:");
        System.out.println(p2);
        System.out.println("Information of point 3:");
        System.out.println(p3);
    }
}
