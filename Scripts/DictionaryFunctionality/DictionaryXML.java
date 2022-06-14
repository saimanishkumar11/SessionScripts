package DictionaryFunctionality;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.text.Document;

import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DictionaryXML {
	
	static WebDriver driver;
	File source;
	FileInputStream fis;
	SAXReader reader;
	Document doc;
	
	public void readFromXml() throws FileNotFoundException, DocumentException {
		
		source= new File("./TestResource/dictionary.xml");
		fis= new FileInputStream(source);
		reader= new SAXReader();
		doc= (Document) reader.read(fis);

		
	}
	
	
	By logo=By.xpath((((Node) doc).selectSingleNode("//DictionaryFunctionality/logo")).getText());
	By wordoftheyear=By.xpath((((Node) doc).selectSingleNode("//DictionaryFunctionality/logo")).getText());
	By search=By.xpath((((Node) doc).selectSingleNode("//DictionaryFunctionality/logo")).getText());
	By serachbtn=By.xpath((((Node) doc).selectSingleNode("//DictionaryFunctionality/logo")).getText());
	By volumebtn=By.xpath((((Node) doc).selectSingleNode("//DictionaryFunctionality/logo")).getText());
	
	public void dictionary(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	
	

}
