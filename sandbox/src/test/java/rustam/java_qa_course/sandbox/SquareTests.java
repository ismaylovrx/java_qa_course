package rustam.java_qa_course.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testArea() {
        Point p1 = new Point(15.0, 10.0);
        Point p2 = new Point(15.0, 12.0);
        Assert.assertEquals(p1.distance(p2), 2.0);
    }


}
