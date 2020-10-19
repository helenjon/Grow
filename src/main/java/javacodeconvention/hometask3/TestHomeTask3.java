package javacodeconvention.hometask3;


public class TestHomeTask3 {


//    "1. Create a class that describes a triangle. It should be defined by using three points which describe the vertexes of this
//    triangle. Create a method that is able to calculate the are of the triangle: it should return a double value (an area) and should
//    throw and exception if the area could not be calculated (for example if the triangle is self-intersecting).
//    Create a simple class which will use the triangle class.
//    Note: the exception should be Checked"


    public static void main(String[] args) {
        Triangle test1 = new Triangle(1, 1, 2, 5, 5, 3);
        test1.calculateSquare();
        Triangle test2 = new Triangle();
        test2.setPoints("A", 1, 1);
        test2.calculateSquare();
        test2.setPoints("M", 5, 3);
        test2.setPoints("B", 2, 5);
        test2.calculateSquare();

    }
}


