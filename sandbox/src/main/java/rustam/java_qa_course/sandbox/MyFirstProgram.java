package rustam.java_qa_course.sandbox;

public class MyFirstProgram {


    public static void main(String[] args) {

       double x1 = 6;
       double x2 = 5;
       double y1 = 5;
       double y2 = 5;

        System.out.println("Расстояние между двумя точками r1 и r2 = " + Distance(x1, x2, y1, y2));
    }

    public static double Distance (Double x1, Double x2, Double y1, Double y2){


        return Math.sqrt(((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
    }



}