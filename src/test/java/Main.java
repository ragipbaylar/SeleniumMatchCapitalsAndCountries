import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Main {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        WebElements we = new WebElements();

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        Actions actions = new Actions(driver);

        for (WebElement e : we.getCapitals()) {
            for (WebElement k : we.getCountries()) {

                Action action = actions.clickAndHold(e).moveToElement(k).release(k).build();
                action.perform();

                if (e.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) {
                    we.getCountries().remove(k);
                    break;
                }
            }
        }
        Driver.quitDriver();
    }
}
