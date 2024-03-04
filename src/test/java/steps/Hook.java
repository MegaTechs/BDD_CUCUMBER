package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
  //  @Before
    public void setUp(){
        //driver = new FirefoxDriver();
        System.out.println("Before Method");
    }
   // @After
    public void cleanUp(){

        System.out.println("After Method");
        //driver.close();
    }

}
