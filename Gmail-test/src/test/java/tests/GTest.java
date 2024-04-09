package tests;

import base.TestBase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GTest extends TestBase {

    @Before
    public void openPage() {
    open( "https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/u/0/&ddm=0&dsh=S-922427226:1712686028610868&emr=1&flowEntry=SignUp&flowName=GlifWebSignIn&followup=https://mail.google.com/mail/u/0/&ifkv=ARZ0qKKvSFBCSHXkhBdrtvPEgqaoaATaWez9Mq67t6uesfvctFB-3ZDo8Boqh69cUs-_gUFTfn9h&osid=1&service=mail&theme=mn&TL=AEzbmxz_jzz5Lk6wCmt9FpaGJ544UVLPI4NTEvLOodhr7QZT28w4R-4YVjcQxWNh");
    }

    @Test
    public void test () {
        $(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div/div/div/button/span")).click();
        $(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Lorne");
        $(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span")).click();
        $(By.xpath("//*[@id=\"day\"]")).sendKeys("13");
        $(By.xpath("//*[@id=\"month\"]")).click();
        $(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div[1]/div[2]/div/div/div[2]/select/option[5]")).click();
        $(By.xpath("//*[@id=\"year\"]")).sendKeys("1953");
        $(By.xpath("//*[@id=\"gender\"]")).click();
        $(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div[2]/div[1]/div/div[2]/select/option[3]")).click();
        $(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div/div/div/button/span")).click();
        $(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div[1]/div[1]/div/span/div[1]/div/div[1]/div/div[3]/div")).click();
        $(By.xpath("//*[@id=\"next\"]/div/button/span")).click();
        $(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("malevolent-2");
        $(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("malevolent-2");
        $(By.xpath("//*[@id=\"createpasswordNext\"]/div/button/span")).click();
        $(By.xpath("//*[@id=\"yDmH0d\"]/div[1]/div[1]/div[2]/div/div/div[3]/div/div[1]/div[2]/div/div/button/span")).click();
        $(By.xpath("//*[@id=\"recoverySkip\"]/div/button/div[3]")).click();
        $(By.xpath("//*[@id=\"next\"]/div/button/span")).click();
        $(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div/div/div[1]/div/span/div[1]/div/div[1]/div/div[3]/div")).click();
        $(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div/div/div/button/span")).click();
        $(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div/div[2]/div/div/button/span")).click();
        $(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div/div[2]/div/div/button/span")).click();
        $(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[1]/div/div/button/span")).click();

    }
    @After
    public void tearDown () {

    }
}
