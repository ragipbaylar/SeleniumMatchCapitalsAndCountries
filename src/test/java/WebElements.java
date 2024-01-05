import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebElements {
    public WebElements() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "div[id='answerDiv']>div")
    private List<WebElement> capitals;

    @FindBy(css = "div[class='destinationBox']")
    private List<WebElement> countries;

    public List<WebElement> getCapitals() {
        return capitals;
    }

    public List<WebElement> getCountries() {
        return countries;
    }
}
