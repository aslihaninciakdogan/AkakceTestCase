package org.akakce.ui.functions;

import org.akakce.ui.base.BaseFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.logging.Logger;

import static org.akakce.ui.constants.CaseStudyConstants.*;

public class CaseStudyFunction extends BaseFunction {
    static Logger log = Logger.getLogger(CaseStudyFunction.class.getName());
    public CaseStudyFunction(WebDriver driver) {
        super(driver);
    }

    public CaseStudyFunction clickSearchArea(){
        click(SEARCH_INPUT);
        return this;

    }
    public CaseStudyFunction search(String searchText){
        sendKeys(SEARCH_INPUT, searchText);
        return this;
    }

    public CaseStudyFunction clickSearchButton(){
        click(SEARCH_BUTTON);
        return this;
    }

    public CaseStudyFunction clickProduct(){
        try {
            Thread.sleep(Duration.ofSeconds(3));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement firstProduct = getFirstElementInListByBy(PRODUCT);
        firstProduct.click();
        return this;
    }

    public CaseStudyFunction clickFollowProduct(){
        click(FOLLOW_BUTTON);
        return this;
    }

    public CaseStudyFunction clickMailArea(){
        click(EMAIL_AREA);
        return this;
    }

    public CaseStudyFunction eMAil (String eMailText){
        sendKeys(EMAIL_AREA, eMailText);
        return this;

    }

    public CaseStudyFunction clickPasswordArea(){
        click(PASSWORD_AREA);
        return this;
    }

    public CaseStudyFunction Password(String PasswordText){
        sendKeys(PASSWORD_AREA, PasswordText);
        return this;
    }

    public CaseStudyFunction clickLoginButton(){
        click(LOGIN_BUTTON);
        return this;
    }
}
