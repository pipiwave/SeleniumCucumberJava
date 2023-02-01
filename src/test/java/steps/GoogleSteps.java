package steps;


import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.GooglePage;
public class GoogleSteps{

    GooglePage google = new GooglePage();

    @Given("navego a google")
        public void navigateToGoogle(){
        google.navigateToGoogle();
        google.clickCookies();
        
    }

    @When("escribo la busqueda")
    public void enterSearchCriteria(){
        google.enterSearchCriteria("el mago de oz");
    }

    @And("hago click")
    public void clickSearchButton(){
        google.clickGooglesearch();
    }

    @Then("obtengo resultado")
    public void validateResults(){
        
        //Assert.isTrue(google.isDisplayedResult(),"no es OK");
        google.isDisplayedResult();
        
    }

    @When("esta el banner de google")
    public void bannerOK(){
        Assert.assertFalse("la búsqueda ha fallado", google.isDisplayedBannerGoogle());
    }
}