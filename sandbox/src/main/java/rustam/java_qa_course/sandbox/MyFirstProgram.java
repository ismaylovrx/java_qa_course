package rustam.java_qa_course.sandbox;

public class MyFirstProgram {


    public static void main(String[] args) {

        Point p1 = new Point(15.0, 120.0);
        Point p2 = new Point(16.0, 20.0);

        System.out.println("Расстояние между двумя точками  координат = " + Distance(p1, p2));
    }

    public static double Distance (Point p1, Point p2){


        return Math.sqrt(((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y)));
    }



}