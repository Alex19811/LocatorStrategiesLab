package com.mainacad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DriverCommand;

import javax.sound.sampled.Line;


public class Lab
{
    private static By info_Massage = By.cssSelector("p:nth-child(3) em" );
    private static By TextForm = By.cssSelector(".page-title-head h1" );
    private static By Link = By.cssSelector("[href='http\\:\\/\\/toolsqa\\.com\\/automation-practice-form\\/'] strong" );
    private static By FirstName = By.cssSelector("[name='firstname']" );
    private static By LastName = By.cssSelector("[name='lastname']" );
    private static By Sex = By.cssSelector("fieldset .control-group:nth-child(18) [name='sex']:nth-child(2)" );
    private static By YearsOfExperience = By.cssSelector("fieldset .control-group:nth-child(23) [name='exp']:nth-child(6)" );
    private static By Date = By.cssSelector("fieldset p:nth-child(26) [type]" );
    private static By AutomationToolQtp = By.cssSelector("fieldset .control-group:nth-child(40) [name='tool']:nth-child(2)" );
    private static By AutomationToolSeleniumUde = By.cssSelector("fieldset .control-group:nth-child(40) [name='tool']:nth-child(4)" );
    private static By NameContinents = By.cssSelector(" fieldset .control-group:nth-child(43) .controls:nth-child(3)" );
    private static By BrowserCommands = By.cssSelector(" [multiple] option:nth-of-type(1)" );
    private static By NavigationCommands = By.cssSelector(" [multiple] option:nth-of-type(2)" );
    private static By Button = By.cssSelector(" [name='submit']" );
    private static By InfoText1 = By.cssSelector(" .bcd" );
    private static By InfoText2 = By.cssSelector(" #NextedText" );





    public static void main(String[] args){
        //Создаём системную переменную которая содержит путь к драйверу
        System.setProperty("webdriver.chrome.driver","src\\main\\java\\com\\mainacad\\drivers\\chromedriverWin.exe");

        //Создаём вебдрайвер
        WebDriver driver = new ChromeDriver();

        //Открываем тестовую страницу
        driver.get("https://www.toolsqa.com/automation-practice-form/");

        //TODO: Вывести в консоль текст Инфо сообщения
        WebElement element = driver.findElement(info_Massage);
        System.out.println(element.getText());

        //TODO: Вывести в консоль текст заголовка формы ("Practice Automation Form")
        WebElement elementTextForm = driver.findElement(TextForm);
        System.out.println(elementTextForm.getText());

        //TODO: Кликнуть линк Partial Link Test
        WebElement elementLink = driver.findElement(Link);
        elementLink.click();

        //TODO: Заполнить поле First name:
        WebElement elementFirstName = driver.findElement(FirstName);
        elementFirstName.sendKeys("Bob");

        //TODO: Заполнить поле Last name:
        WebElement elementLastName = driver.findElement(LastName);
        elementLastName.sendKeys("Jonson");

        //TODO: Выбрать пол
        WebElement elementSex = driver.findElement(Sex);
        elementSex.click();

        //TODO: Выбрать количество лет опыта
        WebElement elementYearOfExperience = driver.findElement(YearsOfExperience);
        elementYearOfExperience.click();

        //TODO: Заполнить поле дата
        WebElement elementDate = driver.findElement(Date);
        elementDate.sendKeys("07/05/2019");

        //TODO: Выбрать несколько Automation Tool
        WebElement elementAutomationToolQtp = driver.findElement(AutomationToolQtp);
        elementAutomationToolQtp.click();
        WebElement elementAutomationToolSeleniumUde = driver.findElement(AutomationToolSeleniumUde);
        elementAutomationToolSeleniumUde.click();


        //TODO: Выбрать континент из выпадающего списка
        WebElement elementNameContinents = driver.findElement(NameContinents);
        elementNameContinents.click();

        //TODO: Выбрать несколько вариантов из списка Selenium Commands
        WebElement elementBrowserCommands = driver.findElement(BrowserCommands);
        elementBrowserCommands.click();
        WebElement elementNavigationCommands = driver.findElement(NavigationCommands);
        elementNavigationCommands.click();


        //TODO: Кликнуть на кнопку Button
        WebElement elementButton = driver.findElement(Button);
        elementButton.click();

        //TODO: Вывести в консоль текст лейбла Text1
        WebElement elementText1 = driver.findElement(InfoText1);
        System.out.println(elementText1.getText());

        //TODO: Вывести в консоль текст лейбла Text2
        WebElement elementText2 = driver.findElement(InfoText2);
        System.out.println(elementText2.getText());

        //TODO: Закрыть браузер
        driver.close();
    }
}
