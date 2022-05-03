package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

public class Parent {
    private WebDriverWait wait;
    private JavascriptExecutor js;
    private Actions actions;
    private static WebDriver driver;

    public Parent() {
        wait = new WebDriverWait(singeltonDriver.getDriver(), 15);
        js = (JavascriptExecutor) singeltonDriver.getDriver();
        actions = new Actions(singeltonDriver.getDriver());
    }

    public void clickElement(WebElement element) { // scrolls to element and click on it
       // scrollToElement(element);
        //waitUntilClickable(element);
        element.click();
    }
    public void clickElementohneScroll(WebElement element) { // scrolls to element and click on it
        waitUntilClickable(element);
        element.click();
    }
    public void scrollToElement(WebElement element) { // scrolls to element
        js.executeScript("arguments[0].scrollIntoView(false);", element);
    }

    public void waitUntilClickable(WebElement element) { // waits until the element to be able to be clicked
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisible(WebElement element) { // waits until the element to be able to be seen
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void sendKeys(WebElement element, String input) { // scrolls to element, clears the previous input and sends the new input
        scrollToElement(element);
        waitUntilVisible(element);
        element.clear();
        element.sendKeys(input);
    }

    public void assertMessage(WebElement element, String message) { // asserts a webelement's text contains message
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().trim().contains(message));
    }



    public int randomIndexForLists(List<WebElement> list) { // generates random index
        return (int) (Math.random() * list.size());
    }

    public void clickRandomlyFromAList(List<WebElement> list) { // clicks an element from a list randomly
        list.get(randomIndexForLists(list)).click();
    }
    public void clickWithNameFromAList(List<WebElement> list,String name) {// clicks an element from a list randomly
        wait.until(ExpectedConditions.visibilityOfAllElements(list));
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).getText().contains(name)){
                list.get(i).click();
                break;
            }
        }
    }
    public void hoverOverRandomlyOnAnElement(List<WebElement> list) { // hovers over an element of a list randomly
        actions.moveToElement(list.get(randomIndexForLists(list))).build().perform();
    }

    public void hoverOverRandomlyOnAnElement(WebElement element) { // hovers over an element
        actions.moveToElement(element).build().perform();
    }

    public void javaScriptClick(WebElement element) {
        scrollToElement(element);
        waitUntilClickable(element);
        JavascriptExecutor executor = (JavascriptExecutor) singeltonDriver.getDriver();
        executor.executeScript("arguments[0].click();", element);
    }


    public void switchToNewTab() {
        String homePageID = singeltonDriver.getDriver().getWindowHandle();
        Set<String> windowIds = singeltonDriver.getDriver().getWindowHandles();
        for (String id : windowIds) {
            if (id.equals(homePageID)) continue;
            singeltonDriver.getDriver().switchTo().window(id);
        }
    }

    public void optionsActions(WebElement element, WebDriver driver) {
        actions.moveToElement(element).sendKeys(Keys.ENTER).build().perform();
    }

    public  void options_select(WebElement element,String Produktname){
        Select select=new Select(element);
        select.selectByValue(Produktname);

    }
    public void assertMessageMitErgebnis(String BildSchrim) { // asserts a webelement's text contains message

        System.out.println((Integer.parseInt(BildSchrim.trim())/1000000000));
        Assert.assertTrue((Integer.parseInt(BildSchrim.trim())/1000000000)>=1);
    }
}
