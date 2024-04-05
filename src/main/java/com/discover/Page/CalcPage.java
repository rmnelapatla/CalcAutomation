package com.discover.Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcPage {
        WebDriver webDriver;
        static  double decimaloutput=0;
        static int intoutput=0;
    public CalcPage(WebDriver driver){
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@value='1']")
    WebElement btnNum1;
    @FindBy(xpath = "//input[@value='2']")
    WebElement btnNum2;
    @FindBy(xpath = "//input[@value='3']")
    WebElement btnNum3;
    @FindBy(xpath = "//input[@value='4']")
    WebElement btnNum4;
    @FindBy(xpath = "//input[@value='5']")
    WebElement btnNum5;
    @FindBy(xpath = "//input[@value='6']")
    WebElement btnNum6;
    @FindBy(xpath = "//input[@value='7']")
    WebElement btnNum7;
    @FindBy(xpath = "//input[@value='8']")
    WebElement btnNum8;
    @FindBy(xpath = "//input[@value='9']")
    WebElement btnNum9;
    @FindBy(xpath = "//input[@value='0']")
    WebElement btnZero;

    @FindBy(xpath = "//input[@value='.']")
    WebElement btnDecimal;

    @FindBy(xpath = "//input[@value='C']")
    WebElement btnCancel;

    @FindBy(xpath = "//input[@id='add']")
    WebElement btnAdd;

    @FindBy(xpath = "//input[@id='subtract']")
    WebElement btnSub;

    @FindBy(xpath = "//input[@id='multiply']")
    WebElement btnMulti;

    @FindBy(xpath = "//input[@id='divide']")
    WebElement btnDiv;

    @FindBy(xpath = "//input[@value='=']")
    WebElement btnEqual;

    @FindBy(xpath = "//div[@id='display']/div")
    WebElement valueOutput;


    public WebElement getNumberElement(int number){
        WebElement webElement =null;
        switch (number){
            case 1:
                webElement= btnNum1;
                break;
            case 2 :
                webElement= btnNum2;
                break;
            case 3:
                webElement= btnNum3;
                break;
            case 4 :
                webElement= btnNum4;
                break;
            case 5:
                webElement= btnNum5;
                break;
            case 6 :
                webElement= btnNum6;
                break;
            case 7:
                webElement= btnNum7;
                break;
            case 8 :
                webElement= btnNum8;
                break;
            case 9:
                webElement= btnNum9;
                break;
            case 0 :
                webElement= btnZero;
                break;
        }

        return  webElement;
    }


    public WebElement getOpertorElement(String operator){
        WebElement webElement =null;
        switch (operator){
            case "+":
                webElement =btnAdd;
                break;
            case "-":
                webElement = btnSub;
                break;
            case "*":
                webElement = btnMulti;
                break;
            case "/":
                webElement =btnDiv;
                break;
            case "=":
                webElement =btnEqual;
                break;
            case "C":
                webElement=btnCancel;
                break;
            case "c":
                webElement=btnCancel;
                break;
            case ".":
                webElement=btnDecimal;
                break;

        }

        return webElement;
    }


    public WebElement validateOutPut(){
        return  valueOutput;
    }




}
