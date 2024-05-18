package Task1;

import Task1.BrokenLine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){

        System.out.println(BrokenLine.getColor());

        List<Point> points = new ArrayList<>();
        Point p1 = new Point(0, 0);
        points.add(p1);
        points.add(new Point(3, 4));
        points.add(new Point(4, 3));
        points.add(new Point(6, 3));

        BrokenLine line = new BrokenLine(points);

        System.out.println(line.length());

        System.out.println(line.length(2,4));

        p1.setX(1);
        p1.setY(1);

        System.out.println(line.length());



    }
}
