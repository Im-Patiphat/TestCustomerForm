import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC01 {
	@Test
	 void TestCase1() {
	        
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://localhost/customer/web/");
	        WebElement firstnameInput = driver.findElement(By.id("firstname"));
	        firstnameInput.sendKeys("JohnJohn");
	        WebElement lastnameInput = driver.findElement(By.id("lastname"));
	        lastnameInput.sendKeys("canonc");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("2");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("firstname")).getText();
	        assertEquals("JohnJohn", result);
	        driver.quit();
	    }
	@Test
	 void TestCase2() {
	        
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://localhost/customer/web/");
	        WebElement firstnameInput = driver.findElement(By.id("firstname"));
	        firstnameInput.sendKeys("Johnj");
	        WebElement lastnameInput = driver.findElement(By.id("lastname"));
	        lastnameInput.sendKeys("canoncanoncano");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("149");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("firstname")).getText();
	        assertEquals("Johnj", result);
	        driver.quit();
	    }
	@Test
	 void TestCase3() {
	        
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://localhost/customer/web/");
	        WebElement firstnameInput = driver.findElement(By.id("firstname"));
	        firstnameInput.sendKeys("Johnjo");
	        WebElement lastnameInput = driver.findElement(By.id("lastname"));
	        lastnameInput.sendKeys("canoncanoncanon");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("150");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("firstname")).getText();
	        assertEquals("Johnjo", result);
	        driver.quit();
	    }
	@Test
	 void TestCase4() {
	        
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://localhost/customer/web/");
	        WebElement firstnameInput = driver.findElement(By.id("firstname"));
	        firstnameInput.sendKeys("Johnjohnjohnjo");
	        WebElement lastnameInput = driver.findElement(By.id("lastname"));
	        lastnameInput.sendKeys("canoncan");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("75");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("firstname")).getText();
	        assertEquals("Johnjohnjohnjo", result);
	        driver.quit();
	    }
	@Test
	 void TestCase5() {
	        
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://localhost/customer/web/");
	        WebElement firstnameInput = driver.findElement(By.id("firstname"));
	        firstnameInput.sendKeys("Johnjohnjohnjoh");
	        WebElement lastnameInput = driver.findElement(By.id("lastname"));
	        lastnameInput.sendKeys("canoncan");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("75");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("firstname")).getText();
	        assertEquals("Johnjohnjohnjoh", result);
	        driver.quit();
	    }
	@Test
	 void TestCase6() {
	        
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://localhost/customer/web/");
	        WebElement firstnameInput = driver.findElement(By.id("firstname"));
	        firstnameInput.sendKeys("John");
	        WebElement lastnameInput = driver.findElement(By.id("lastname"));
	        lastnameInput.sendKeys("canoncan");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("75");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("fromname")).getText();
	        assertEquals("Customer Detail", result);
	        driver.quit();
	    }
	@Disabled
	 void TestCase7() {
	        
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://localhost/customer/web/");
	        WebElement firstnameInput = driver.findElement(By.id("firstname"));
	        firstnameInput.sendKeys("Johnjohnjohnjohn");
	        WebElement lastnameInput = driver.findElement(By.id("lastname"));
	        lastnameInput.sendKeys("canoncan");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("75");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("fromname")).getText();
	        assertEquals("Customer Detail", result);
	        driver.quit();
	    }
	@Test
	 void TestCase8() {
	        
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://localhost/customer/web/");
	        WebElement firstnameInput = driver.findElement(By.id("firstname"));
	        firstnameInput.sendKeys("johnjohn");
	        WebElement lastnameInput = driver.findElement(By.id("lastname"));
	        lastnameInput.sendKeys("cano");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("75");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("fromname")).getText();
	        assertEquals("Customer Detail", result);
	        driver.quit();
	    }
	@Disabled
	 void TestCase9() {
	        
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://localhost/customer/web/");
	        WebElement firstnameInput = driver.findElement(By.id("firstname"));
	        firstnameInput.sendKeys("johnjohn");
	        WebElement lastnameInput = driver.findElement(By.id("lastname"));
	        lastnameInput.sendKeys("cannoncan");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("75");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("fromname")).getText();
	        assertEquals("Customer Detail", result);
	        driver.quit();
	    }
	@Test
	 void TestCase10() {
	        
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://localhost/customer/web/");
	        WebElement firstnameInput = driver.findElement(By.id("firstname"));
	        firstnameInput.sendKeys("johnjohn");
	        WebElement lastnameInput = driver.findElement(By.id("lastname"));
	        lastnameInput.sendKeys("cannoncancannoncanc");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("0");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("fromname")).getText();
	        assertEquals("Customer Detail", result);
	        driver.quit();
	    }
	
	@Test
	 void TestCase11() {
	        
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://localhost/customer/web/");
	        WebElement firstnameInput = driver.findElement(By.id("firstname"));
	        firstnameInput.sendKeys("johnjohn");
	        WebElement lastnameInput = driver.findElement(By.id("lastname"));
	        lastnameInput.sendKeys("cannoncan");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("151");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("fromname")).getText();
	        assertEquals("Customer Detail", result);
	        driver.quit();
	    }

	private void assertEquals(String string, String result) {
		// TODO Auto-generated method stub
		
	}
}
