package testcase;

import org.openqa.selenium.WebDriver;

public class SearchInputText {
	
	private WebDriver driver;
	public SearchInputText(WebDriver driver) {
		this.driver = driver;
	}
	//veirfica se contém o título Brasil – Wikipédia, a enciclopédia livre
	public void checkWord() {
		if(this.driver.getTitle().contains("Brasil – Wikipédia, a enciclopédia livre")) {
			System.out.print("Título encontrado");
		}else {
			System.out.print("Título não encontrado");
		}
	}
}