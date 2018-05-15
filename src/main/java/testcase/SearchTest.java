package testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTest {
	
	private WebDriver driver;
	private SearchInputText search;
	
	@Before
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();;//configura para o navegador
		//baixa dependencias antes do teste
		this.driver = new FirefoxDriver();//ChromeDriver ou qualquer navegador
		this.driver.get("https://pt.wikipedia.org");//referencia site a ser testado
		this.search = new SearchInputText(driver);
	}
	@Test
	public void testMain() {
		WebElement searchInput = this.driver.findElement(By.id("searchInput"));
		WebElement searchButton = this.driver.findElement(By.id("searchButton"));
		searchInput.sendKeys("Brasil");
		searchButton.click();
		this.search.checkWord();
	}
	
	@After
	public void tearDown() {
		this.driver.quit();
	}	
}