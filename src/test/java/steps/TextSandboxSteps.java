package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.TestSandbox;

public class TextSandboxSteps {
    
    TestSandbox sandboxPage = new TestSandbox();

    @Given("navego a la web del dropdown")
    public void navigateToSandBoxWeb(){
        sandboxPage.navigateToSandbox();
    }

    @And("selecciono el valor del dropdown")
    public void selectValueforDropdown(){
        sandboxPage.selectValueforDropdown("Apple");
    }
}
