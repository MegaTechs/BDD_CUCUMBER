package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Registration {
    WebDriver driver = null;
    @Given("User in a Home Page")
    public void user_in_a_home_page() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();

driver.close();
    }

    @When("User click on Register link")
    public void user_click_on_register_link() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //a[@class='ico-register']
        //a[text()='Register']
        WebElement RegisterLink= driver.findElement(By.xpath(" //a[text()='Register']"));
        RegisterLink.click();
        driver.quit();
    }

    @Then("user should fill up the from with their information")
    public void user_should_fill_up_the_from_with_their_information() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //a[@class='ico-register']
        //a[text()='Register']
        WebElement RegisterLink= driver.findElement(By.xpath(" //a[text()='Register']"));

        RegisterLink.click();

        WebElement gender= driver.findElement(By.xpath("//input[@id='gender-female']"));
        gender.click();

        WebElement inputFirstName= driver.findElement(By.xpath("//input[@id='FirstName']"));


        inputFirstName.sendKeys("Mohammad");

        WebElement inputLastName= driver.findElement(By.xpath("//input[@id='LastName']"));
        inputLastName.sendKeys("Haque");




        WebElement drop= driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        Select dropdown= new Select(drop);



        Select SelectDropDown = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
        Thread.sleep(7000);
        SelectDropDown.selectByVisibleText("20");
        Thread.sleep(7000);
        SelectDropDown.selectByValue("10");
        Thread.sleep(7000);

        SelectDropDown.selectByIndex(5);
        Thread.sleep(7000);

        Select DateOfBirthMonth = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
        DateOfBirthMonth.selectByVisibleText("9");
        Select DateOfBirthYear = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
        DateOfBirthYear.selectByVisibleText("9");

//Mouse Over
        Actions actions = new Actions(driver);
        //Retrieve WebElement 'Music' to perform mouse hover
        WebElement menuOption = driver.findElement(By.xpath("//a[text()='Computers '][1]"));
        //Mouse hover menuOption 'Music'
        actions.moveToElement(menuOption).perform();

        Thread.sleep(5000);
        WebElement selectMenuOption = driver.findElement(By.xpath("//a[text()='Desktops '][1]"));
        Thread.sleep(7000);
        selectMenuOption.click();


        driver.close();



    }
}
