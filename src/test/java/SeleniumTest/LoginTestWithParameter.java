package SeleniumTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//step 1 : add the @runWith(parameterized.class)annotation
@RunWith(Parameterized.class)
public class LoginTestWithParameter {
    //step 2 : create global/class level reference variable
    String username;
    String password;
    String browser;
//step3 = create the constructor
    public LoginTestWithParameter(String username,String password,String browser){
        this.username = username;
        this.password= password;
        this.browser = browser;
    }
    @Test
    public void loginTest(){
        System.out.println(username + "----" +password+"--"+browser);
    }
    //add the @parameters annotation for multiple parameters
    @Parameters
    public static Collection<Object[]> getData(){
        Object [][] data = new Object[4][3];
        //1st row
        data[0][0]= "rudra";
        data[0][1]= "pass1";
        data[0][2]= "chrome";
//2nd row
        data[1][0]= "sneha";
        data[1][1]= "pass2";
        data[1][2]= "firefox";

        data[2][0]= "swati";
        data[2][1]= "pass3";
        data[2][2]= "brave";

        data[3][0]= "shree";
        data[3][1]= "pass4";
        data[3][2]= "safari";
        return Arrays.asList(data);
    }
}
