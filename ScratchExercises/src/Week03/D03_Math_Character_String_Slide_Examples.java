package Week03;

import java.awt.geom.Point2D;
import java.util.Scanner;

public class D03_Math_Character_String_Slide_Examples {

    public static void main(String[] args) {

        double x1 = 0;
        double x2 = 0;
        double x3 = 0;
        double y1 = 0;
        double y2 = 0;
        double y3 = 0;
        double a = 0;
        double b = 0;
        double c = 0;

        Scanner input = new Scanner(System.in);

        // Get coordinates
        System.out.println("Enter the first point as \"x y\" of the triangle");
        x1 = input.nextDouble();
        y1 = input.nextDouble();

        System.out.println("Enter the second point as \"x y\" of the triangle");
        x2 = Double.parseDouble(input.next());
        y2 = Double.parseDouble(input.next());

        System.out.println("Enter the third point as \"x y\" of the triangle");
        x3 = Double.parseDouble(input.next());
        y3 = Double.parseDouble(input.next());

        // Calculate side lengths

        a = Point2D.distance(x2, y2, x3, y3);
        b = Point2D.distance(x3, y3, x1, y1);
        c = Point2D.distance(x1, y1, x2, y2);

        System.out.println("The angles of the triangle are:");
        System.out.println(" A " + Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        System.out.println(" A " + Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        System.out.println(" A " + Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        System.out.println("Enter a name");

        String name = input.next();

        System.out.println("name is : " + name);

    }

}
