import JavaCodeConvention.HomeTask3.Triangle;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaCodeConvHomeTask3 {

    @Test
    public void triangCreateWithPoints() {
       Triangle t = new Triangle(1,1,2,5,5,3);
       String test = "class JavaCodeConvention.HomeTask3.Triangle";
       Assert.assertEquals( test, t.getClass().toString());
    }

    @Test
    public void triangCreateWithOutPoints() {
        Triangle t = new Triangle();
        String test = "class JavaCodeConvention.HomeTask3.Triangle";
        Assert.assertEquals( test, t.getClass().toString());
    }

}
