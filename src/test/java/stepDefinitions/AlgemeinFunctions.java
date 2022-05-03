package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.CalculatorHome;

public class AlgemeinFunctions {


    CalculatorHome calculatorHome = new CalculatorHome();


    @When("^Verifizieren Sie das Zeichen,dass es über Tastatur \"([^\"]*)\"  eingegeben wurde\\.$")
    public void verifizierenSieDasZeichenDassEsÜberTastaturEingegebenWurde(String Zeichen) {

        switch (Zeichen) {
            case "MR":
                calculatorHome.clickElement(calculatorHome.getMemoryMRMCButton());
                break;
            case "=":
                calculatorHome.clickElement(calculatorHome.getGleichButton());
                break;

            case ".":
                calculatorHome.clickElement(calculatorHome.getPunktButton());
                break;
            case "2":
                calculatorHome.clickElement(calculatorHome.getZweiButton());
                break;
            case "3":
                calculatorHome.clickElement(calculatorHome.getDreiButton());
                break;
            case "5":
                calculatorHome.clickElement(calculatorHome.getFünfButton());
                break;
            case "6":
                calculatorHome.clickElement(calculatorHome.getSechsButton());
                break;
            case "7":
                calculatorHome.clickElement(calculatorHome.getSevenButton());
                break;
            case "8":
                calculatorHome.clickElement(calculatorHome.getAchtButton());
                break;
        }
    }

    @Then("^Der Anwender sollte Zahlenfolgen von mindestens zehn Zeichen auf dem Rechnerbildschirm sehen können\\.$")
    public void derAnwenderSollteZahlenfolgenVonMindestensZehnZeichenAufDemRechnerbildschirmSehenKönnen() {
        System.out.println(calculatorHome.getCalculatorbildSchrim().getText());
        System.out.println((Long.parseLong(calculatorHome.getCalculatorbildSchrim().getText().trim())/1000000000));
        Assert.assertTrue((Long.parseLong(calculatorHome.getCalculatorbildSchrim().getText().trim())/1000000000)>=1);

    }

    @And("^Verifizieren Sie das Zeichen,dass es über NummerBlok \"([^\"]*)\"  eingegeben wurde\\.$")
    public void verifizierenSieDasZeichenDassEsÜberNummerBlokEingegebenWurde(String Zeichen)  {
        switch (Zeichen) {
            case "MR":
                calculatorHome.clickElement(calculatorHome.getMemoryMRMCButton());
                break;
            case "=":
                calculatorHome.clickElement(calculatorHome.getGleichButton());
                break;

            case ".":
                calculatorHome.clickElement(calculatorHome.getPunktButton());
                break;
            case "2":
                calculatorHome.clickElement(calculatorHome.getZweiButton());
                break;
            case "3":
                calculatorHome.clickElement(calculatorHome.getDreiButton());
                break;
            case "5":
                calculatorHome.clickElement(calculatorHome.getFünfButton());
                break;
            case "6":
                calculatorHome.clickElement(calculatorHome.getSechsButton());
                break;
            case "7":
                calculatorHome.clickElement(calculatorHome.getSevenButton());
                break;
            case "8":
                calculatorHome.clickElement(calculatorHome.getAchtButton());
                break;
        }
    }
}
