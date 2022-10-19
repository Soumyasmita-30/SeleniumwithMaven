package SampleTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.DEFAULT)
public class ShopForMobile2 {
    @Test
    public void searchMobile(){
        System.out.println("Search for the mobile");
    }
    @Test
    public  void selectMobile(){
        System.out.println("select particular mobile");

    }
    @Test
    public void checkOut(){
        System.out.println(" make payment and checkout");
    }
}
