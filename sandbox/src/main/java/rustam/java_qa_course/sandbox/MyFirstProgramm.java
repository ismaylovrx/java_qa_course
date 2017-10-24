package rustam.java_qa_course.sandbox;

public class MyFirstProgramm {


	public static void main(String[] args) {

        double x1 = 23;
        double x2 = 23;
        double y1 = 36;
        double y2 = 12;
        double p1 = (x1-x2);
        double p2= (y1-y2);

        System.out.println("Расстояние между двумя точками = " + Distance(p1, p2));
	}

	public static double Distance (double p1, double p2){

	    
	    return Math.sqrt(p1*p1 + p2*p2);
	}



}