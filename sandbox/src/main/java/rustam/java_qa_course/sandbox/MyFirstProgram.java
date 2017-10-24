package rustam.java_qa_course.sandbox;

public class MyFirstProgram {


    public static void main(String[] args) {

        Point r = new Point();

        double x1 = 16;
        double x2 = 13;
        double y1 = 36;
        double y2 = 12;
        r.p1 = (x1-x2);
        r.p2= (y1-y2);

        System.out.println("Расстояние между двумя точками " + r.p1 + " и " + r.p2 +" = " + Distance(r));
    }

    public static double Distance (Point r){


        return Math.sqrt(r.p1*r.p1 + r.p2*r.p2);
    }



}