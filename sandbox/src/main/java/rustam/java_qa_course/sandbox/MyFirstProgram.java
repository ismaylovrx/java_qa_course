package rustam.java_qa_course.sandbox;

public class MyFirstProgram {


    public static void main(String[] args) {

        Point p1 = new Point(15.0, 10.0);
        Point p2 = new Point(15.0, 12.0);

        System.out.println("Расстояние между двумя точками  координат = " + p1.distance(p2));
    }





}