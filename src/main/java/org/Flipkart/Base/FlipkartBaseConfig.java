package org.Flipkart.Base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FlipkartBaseConfig {
	@Test
//	public WebDriver getDriverFlip() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Resume 2023\\Com Axis\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://www.flipkart.com/");
//		return driver;
//	}
	
	public WebDriver setUp(String Port) throws MalformedURLException
    {
WebDriver driver = null;
        String nodeURL;
if(Port.equalsIgnoreCase("5555"))
        {
            nodeURL = "http://192.168.101.7:4444/wd/hub";
            System.out.println("Chrome Browser Initiated");
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();            
            capabilities.setBrowserName("chrome");
            capabilities.setPlatform(Platform.WINDOWS);
           
            driver = new RemoteWebDriver(new URL(nodeURL),capabilities);
           
            driver.get("https://www.flipkart.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //return Port;
        }
       
        else
            if(Port.equalsIgnoreCase("6666"))
            {
                nodeURL = "http://192.168.101.7:4444/wd/hub";
                System.out.println("Edge Browser Initiated");
                DesiredCapabilities capabilities1 = DesiredCapabilities.edge();
                capabilities1.setBrowserName("MicrosoftEdge");
                capabilities1.setPlatform(Platform.WINDOWS);
               
                driver = new RemoteWebDriver(new URL(nodeURL),capabilities1);  
               
                driver.get("https://www.flipkart.com/");
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
        return driver;
       
       
       
    }

}