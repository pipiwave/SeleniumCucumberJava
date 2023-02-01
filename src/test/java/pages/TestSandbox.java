package pages;

public class TestSandbox extends BasePage{

    private String valuedropdown = "//select[@id='first']";


    public TestSandbox(){
        super(driver);
    }

    public void navigateToSandbox(){
        navigateTo("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
    }

    public void selectValueforDropdown(String categoria){
        selectFromDropdownbyValue(valuedropdown, categoria);
    }
    
}
