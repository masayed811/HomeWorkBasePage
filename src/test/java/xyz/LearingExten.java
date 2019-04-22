package xyz;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LearingExten extends Utils {

    @Before
    public void setUp() {
// Chorme web driver path set
        System.setProperty( "webdriver.chrome.driver", "src\\test\\java\\xyz\\WebDriver\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.get( "https://demo.nopcommerce.com/" ); //asking driver for url

// implicit wait set
       driver.manage().timeouts().implicitlyWait( 50, TimeUnit.SECONDS );

    }
    //Clicking element
    @Test
    public void userShouldRegisterSuccessfully() {
// click on Register button to open registration page
        //driver.findElement( By.xpath( "//a[@class=\"ico-register\"]" ) ).click();
        clickElement( By.xpath( "//a[@class=\"ico-register\"]"  ));
        enterText(By.id( "FirstName"),"Md");
        enterText(By.id( "LastName"),"sayed");
        clearAndEnter( By.id( "FirstName"),"Md");
        clearAndEnter( By.id( "LastName"),"sayed");


        }


    }


//
//    }}
    //Clicking element


//Clear Text form inout box/area


//Enter text in input field

//Clear and enter text in input field

//Checking WebElemnt present in DOM



//Checking WebElemnt displayed or not


//Wait for fixed time given in seconds




//Try to click element three times if not available in first go

//isdorpdown present


//Wait for locator to be clickable for given time in seconds

//Wait for element to be clickable for given time in seconds

//date stamp short

//date stamp long


//Wait for element for given time in second

//wait for element to be invisible


// select from visible text

//Select from visible number


//Select from value

// get selected value from dropdown

//Scroll to view element


//Scroll to element and click

//Wait for alert to display

//Get attribute of element


//get css property of element

//take screenshot of browser


//take screenshot of current display(full)


//convert date....