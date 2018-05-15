package testcase;

import org.openqa.selenium.WebDriver;

public class SearchInputText {
	
	private WebDriver driver;
	public SearchInputText(WebDriver driver) {
		this.driver = driver;
	}
	//veirfica se cont�m o t�tulo Brasil � Wikip�dia, a enciclop�dia livre
	public void checkWord() {
		if(this.driver.getTitle().contains("Brasil � Wikip�dia, a enciclop�dia livre")) {
			System.out.print("T�tulo encontrado");
		}else {
			System.out.print("T�tulo n�o encontrado");
		}
	}
}