 import java.util.*;

/**
 * This class is build for learning the new method to declare the class,
 * with the simple detail,and the class must be the finalize
 */
/*public class RecordTest
 {
         public static void main(String[] args)
         {
         var aPoint = new Point(3, 4);
         System.out.println("Coordinates of aPoint: " + aPoint.x() + " " + aPoint.y());
         System.out.println("Distance from origin: " + aPoint.distanceFromOrigin());
         System.out.println("Distance from origin: " + Point.distance(Point.ORIGIN, aPoint));

         // A mutable record
         var aPointInTime = new PointInTime(3, 4, new Date());
         System.out.println("Before: " + aPointInTime);
             aPointInTime.when().setTime(0);
         System.out.println("After: " + aPointInTime);


         var r = new Range(4, 3);
         System.out.println("r: " + r);
         }
         }

         record Point(double x, double y) {
             public Point() { this(0, 0);
         }
         public double distanceFromOrigin() {
             return Math.hypot(x, y);
         }

         public static Point ORIGIN = new Point();
 public static double distance(Point p, Point q)
 {
      return Math.hypot(p.x - q.x, p.y - q.y);
      }
 }

         record PointInTime(double x, double y, Date when) { }

         record Range(int from, int to)
 {

     // A compact constructor
         public Range
         {
         if (from > to) // Swap the bounds
         {
         int temp = from;
         from = to;
         to = temp;
         }
         }
         }



     */