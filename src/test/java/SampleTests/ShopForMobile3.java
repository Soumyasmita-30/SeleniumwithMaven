package SampleTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ShopForMobile3 {
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
    @Test
    public void test_a(){
    System.out.println("test A");
} @Test
    public void test_b(){
        System.out.println("test B");
    } @Test
    public void test_c(){
        System.out.println("test C");
    }

}
