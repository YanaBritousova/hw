import java.util.ArrayList;
import java.util.List;

public class BrokenLine {
    private List<Point> points;
    private static String color = "black";

    public static String getColor() {
        return color;
    }

    public BrokenLine(List<Point> points) {
        this.points = points;
    }
    //Длина всей ломаной
    public double length() {
        double len = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);
            len += distance(p1, p2);
        }
        return len;
    }
    //Длина ломаной между конкретными точками
   public double length(int numPoint1, int numPoint2){
       double len = 0;
       for (int i = numPoint1-1; i < numPoint2-1; i++) {
           Point p1 = points.get(i);
           Point p2 = points.get(i + 1);
           len += distance(p1, p2);
       }
       return len;
   }

    private double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
}
