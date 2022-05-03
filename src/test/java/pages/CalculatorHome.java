package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Parent;
import utils.singeltonDriver;

import java.util.List;

public class CalculatorHome extends Parent {
    private List<WebElement> nummer;

    public CalculatorHome() {
        this.nummer = nummer;
        PageFactory.initElements(singeltonDriver.getDriver(), this);
    }

    @FindBy(css = "span[onclick='r(7)']")
    private WebElement sevenButton;

    @FindBy(css = "span[onclick='r(8)']")
    private WebElement achtButton;

    @FindBy(css = "span[onclick='r(5)']")
    private WebElement fünfButton;

    @FindBy(css = "span[onclick='r(6)']")
    private WebElement sechsButton;

    @FindBy(css = "span[onclick='r(3)']")
    private WebElement dreiButton;

    @FindBy(css = "span[onclick='r(2)']")
    private WebElement zweiButton;

    @FindBy(xpath = "//span[text()='M+']")
    private WebElement memoryPlusButton;

    @FindBy(xpath = "//span[text()='M-']")
    private WebElement memoryMinusButton;

    @FindBy(id = "scimrc")
    private WebElement memoryMRMCButton;

    @FindBy(xpath = "//span[text()='AC']")
    private WebElement ACButton;

    @FindBy(xpath = "//span[text()='.']")
    private WebElement PunktButton;

    @FindBy(xpath = "//span[text()='=']")
    private WebElement GleichButton;

    @FindBy(xpath = "//span[text()='+']")
    private WebElement PlusButton;

    @FindBy(id = "sciOutPut")
    private WebElement CalculatorbildSchrim;

    public void setNummer(List<WebElement> nummer) {
        nummer.add(getSevenButton());
        nummer.add(getFünfButton());
    }

    public List<WebElement> getNummer() {
        return nummer;
    }

    public WebElement getSevenButton() {
        return sevenButton;
    }

    public WebElement getMemoryPlusButton() {
        return memoryPlusButton;
    }

    public WebElement getCalculatorbildSchrim() {
        return CalculatorbildSchrim;
    }

    public WebElement getMemoryMRMCButton() {
        return memoryMRMCButton;
    }

    public WebElement getACButton() {
        return ACButton;
    }

    public WebElement getPlusButton() {
        return PlusButton;
    }

    public WebElement getFünfButton() {
        return fünfButton;
    }

    public WebElement getGleichButton() {
        return GleichButton;
    }

    public WebElement getMemoryMinusButton() {
        return memoryMinusButton;
    }

    public WebElement getSechsButton() {
        return sechsButton;
    }

    public WebElement getDreiButton() {
        return dreiButton;
    }

    public WebElement getZweiButton() {
        return zweiButton;
    }

    public WebElement getPunktButton() {
        return PunktButton;
    }

    public WebElement getAchtButton() {
        return achtButton;
    }
}
