package login;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginUserflowTest {
    String url;

    @BeforeClass
    public void beforeClass(){
        System.out.println("== beforeClass");

        url= "https//www.saucedemo.com";
    }

    @BeforeClass

    public void beforeMethod(){
        System.out.println("== beforeMethod");
        System.out.println("open browser");
        System.out.println("navigate to url ");

    }

@Test
        public static void verify_Login_With_Valid_Credential(){
        System.out.println("== testMethod");
        System.out.println("Enter Username");
        System.out.println("Enter Password");
        System.out.println("Click Login Button");
        System.out.println("Verify login is successful");
    }
@AfterMethod
       public static void afterMethod(){
      System.out.println("==afterMethod");
      System.out.println("Close browser");
    }
   // @Test
   // public static void mythirdtest(){
   //     System.out.println("3rd method");
    }



//}
