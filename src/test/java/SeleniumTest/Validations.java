package SeleniumTest;

import org.junit.Assert;
import org.junit.Test;

public class Validations {
    @Test
    public  void validate(){
        String actual = " A ";
        String expected = "B";
        System.out.println("Begin");
        try {
            Assert.assertEquals(expected, actual);
        }
        catch(Throwable e){
            System.out.println("some error occured" +e);
        }
        System.out.println("End");
        //When we simply have to fail our test case we use
        Assert.fail("should hv logged in but didnt log in");
    }
}
