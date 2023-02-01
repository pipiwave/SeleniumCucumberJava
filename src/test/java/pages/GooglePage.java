package pages;


public class GooglePage extends BasePage{

    private String searchButton = "//input[@value='Buscar con Google']";
    private String cookiesButton = "//*[@id='W0wltc']/div";
    private String searchTextField = "//input[@title='Buscar']";
    //private String resultStats = "//div[@id='result-stats']";
    private String resultStats = "/html[1]/body[1]/div[7]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]";
    private String bannerGoogle = "//body/div[1]/div[2]/div[1]/img[1]";
    
    
    public GooglePage() {
        super(driver);
        
    }

    public void navigateToGoogle(){
        navigateTo("https://www.google.com");
        
    }

    public void clickCookies(){
        clickElement(cookiesButton);
    }

    public void clickGooglesearch(){
        
        clickElement(searchButton);
        
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField,criteria);
    }

    public boolean isDisplayedResult(){
        return elementisDisplayed(resultStats);
        
    }
    public boolean isDisplayedBannerGoogle(){
        return elementisDisplayed(bannerGoogle);
    }

    
    
}
