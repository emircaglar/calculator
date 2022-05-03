package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CalculatorHome;

public class MemoryFunctions {
    CalculatorHome calculatorHome=new CalculatorHome();

    @When("^Verifizieren Sie das Zeichen,dass es über Nummernblock  eingegeben wurde\\.$")
    public void verifizierenSieDasZeichenDassEsÜberNummernblockEingegebenWurde() {
        calculatorHome.clickElement(calculatorHome.getSevenButton());
    }

    @Then("^Der Anwender sollte das Zeichen  auf dem Rechnerbildschirm sehen können\\.$")
    public void derAnwenderSollteDasZeichenAufDemRechnerbildschirmSehenKönnen() {
        System.out.println(calculatorHome.getCalculatorbildSchrim().getText());
        calculatorHome.assertMessage(calculatorHome.getCalculatorbildSchrim(),"7");
    }

    @And("^Klickt die Memory Funktion M\\+-Taste$")
    public void klicktDieMemoryFunktionMTaste() {
        calculatorHome.clickElement(calculatorHome.getMemoryPlusButton());
    }

    @And("^Klickt die C-Taste$")
    public void klicktDieCTaste() {


        calculatorHome.clickElement(calculatorHome.getACButton());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^Der Anwender sollte den Rechnerbildschirm sehen können ,wie es am Anfang war$")
    public void derAnwenderSollteDenRechnerbildschirmSehenKönnenWieEsAmAnfangWar() {
        System.out.println("nachdem c button "+calculatorHome.getCalculatorbildSchrim().getText());
        calculatorHome.assertMessage(calculatorHome.getCalculatorbildSchrim(),"0");
    }

    @And("^Klickt die Memory Funktion MR – Taste$")
    public void klicktDieMemoryFunktionMRTaste() {

        if(calculatorHome.getMemoryMRMCButton().getText().contains("MR")){
        calculatorHome.clickElement(calculatorHome.getMemoryMRMCButton());}
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^Die gespeicherte Zahl  sollte wieder auf dem Rechnerbildschirm  gesehen werden$")
    public void dieGespeicherteZahlSollteWiederAufDemRechnerbildschirmGesehenWerden() {
        System.out.println("nachdem mr  "+ calculatorHome.getCalculatorbildSchrim().getText());
        calculatorHome.assertMessage(calculatorHome.getCalculatorbildSchrim(),"7");
    }

    @And("^Klickt die Plus-Taste$")
    public void klicktDiePlusTaste() {
        calculatorHome.clickElement(calculatorHome.getPlusButton());
    }

    @And("^Verifizieren Sie das Ergebnis,indem  auf  = klickt$")
    public void verifizierenSieDasErgebnisIndemAufKlickt() {
        calculatorHome.clickElement(calculatorHome.getGleichButton());
    }

    @Then("^Der Anwender sollte ein mathematisch korrektes Ergebnis  auf dem Rechnerbildschirm sehen können\\.$")
    public void derAnwenderSollteEinMathematischKorrektesErgebnisAufDemRechnerbildschirmSehenKönnen() {
        calculatorHome.assertMessage(calculatorHome.getCalculatorbildSchrim(),"12");
    }

    @Then("^Der Anwender sollte das Zeichen  auf dem Rechnerbildschirm sehen können(\\d+)\\.$")
    public void derAnwenderSollteDasZeichenAufDemRechnerbildschirmSehenKönnen(int arg0) {
        calculatorHome.clickElement(calculatorHome.getFünfButton());
    }

    @Then("^Keine Änderung sollte auf dem Rechnerbildschirm gesehen können$")
    public void keineÄnderungSollteAufDemRechnerbildschirmGesehenKönnen() {
        calculatorHome.assertMessage(calculatorHome.getCalculatorbildSchrim(),"7");
    }


    @Then("^Der Anwender sollte ein mathematisch korrektes Ergebnis als minus auf dem Rechnerbildschirm sehen können\\.$")
    public void derAnwenderSollteEinMathematischKorrektesErgebnisAlsMinusAufDemRechnerbildschirmSehenKönnen() {
        calculatorHome.assertMessage(calculatorHome.getCalculatorbildSchrim(),"-2");
    }

    @And("^Klickt die Memory Funktionm M- - Taste$")
    public void klicktDieMemoryFunktionmMTaste() {
        System.out.println("azalir 1"+ calculatorHome.getCalculatorbildSchrim().getText());
        calculatorHome.clickElement(calculatorHome.getMemoryMinusButton());
        System.out.println("azalir 2 "+ calculatorHome.getCalculatorbildSchrim().getText());
    }

    @And("^Klickt die Memory Funktion MC - Taste$")
    public void klicktDieMemoryFunktionMCTaste() {
        if(calculatorHome.getMemoryMRMCButton().getText().contains("MC")){
            calculatorHome.clickElement(calculatorHome.getMemoryMRMCButton());}
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
