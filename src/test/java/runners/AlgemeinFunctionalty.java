package runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        features = {"src/test/resources/features/CalculatorAlgemeinFuctions.feature"},
        glue = {"stepDefinitions","utils"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/ExtendReportAlgemein/Calculator_Algemein_extentReport.html"}
)

public class AlgemeinFunctionalty extends AbstractTestNGCucumberTests {

    @AfterClass
    public void ExtendReportCalculator() {
        Reporter.loadXMLConfig("src/test/java/XMLFiles/ExtendReportSet.xml");

        Reporter.setSystemInfo("User Name", "Emir");
        Reporter.setSystemInfo("Application Name", "Calculator");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Department", "QA");

        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
    }

}
