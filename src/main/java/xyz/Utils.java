package xyz;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BasePage {

    //Clicking element
    public void clickElement(By by) {

        driver.findElement( by ).click();

    }

    //Clear Text form inout box/area
    public static void clearField(By by) {
        driver.findElement( by ).clear();
    }

    //Enter text in input field
    public static void enterText(By by, String text) {
        driver.findElement( by ).sendKeys( text );
    }

    //Clear and enter text in input field
    public void clearAndEnter(By by, String text) {
        driver.findElement( by ).clear();
        driver.findElement( by ).sendKeys( text );

    }
    //Checking WebElemnt present in DOM

    public boolean isElementPresent(By by) {

        try {
            driver.findElement( by ).isEnabled();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    //Checking WebElemnt displayed or not
    public boolean isElementDisplayed(By by) {
        try {
            driver.findElement( by ).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    //Wait for fixed time given in seconds

    public static void waitForWebElementToBeClickable(By by, int seconds) {
        WebDriverWait wait = new WebDriverWait( driver, seconds );
        wait.until( ExpectedConditions.elementToBeClickable( by ) );

    }

//Try to click element three times if not available in first go

    public boolean retryForElement(By by) {
        boolean result = false;
        int attempt = 0;
        while (attempt < 3) {
            try {
                Thread.sleep( 10 );
                driver.findElement( by ).click();
                result = true;
                break;
            } catch (Exception e) {
            }
            attempt++;
        }
        return result;
    }


    //Wait for locator to be clickable for given time in seconds

public static void waitForLocatorToBeClickable(By by,int second){
        WebDriverWait wait = new WebDriverWait( driver,second );
        wait.until(ExpectedConditions.elementToBeClickable( by ));

}


//Wait for element for given time in second

    public static void explicitWaitForElement(By by ,int seconds )
    {
        WebDriverWait wait = new WebDriverWait( driver,seconds );
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy( by ));

    }
}

//Scroll to view element






//isdorpdown present




//Wait for element to be clickable for given time in seconds

//date stamp short

//date stamp long




//wait for element to be invisible


// select from visible text

//Select from visible number


//Select from value

// get selected value from dropdown




//Scroll to element and click

//Wait for alert to display

//Get attribute of element


//get css property of element

//take screenshot of browser


//take screenshot of current display(full)


//convert date....
//// Enter text
//{
//
//
