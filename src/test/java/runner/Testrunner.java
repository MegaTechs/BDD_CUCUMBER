package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "feature"
        ,glue={"steps"}
        //,monochrome = false
        //,dryRun = true
       //, tags = "~@sanityTest"
       // , tags = "~@SmokeTest"
//,plugin = {"pretty", "html:target/cucumber"}

)
public class Testrunner {



}

