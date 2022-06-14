package WebDriver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleImagesSep {
	
	private static XSSFWorkbook workbook;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		FileInputStream fis = new FileInputStream("D:\\Capgemini Training\\Selinium\\Data.xlsx");
		workbook =new XSSFWorkbook(fis);
		XSSFSheet ws = workbook.getSheetAt(0);
		
		int rownum = ws.getLastRowNum();
		int colnum =ws.getRow(0).getPhysicalNumberOfCells();
		System.out.println(colnum);
		System.out.println(rownum);
		XSSFCell searchkey;
		for(int i=0; i<=rownum;i++) {
			driver.get("https://www.google.com/");
			 
		
			searchkey= ws.getRow(i).getCell(0);
			System.out.println("Google search image for :"+searchkey);
			
			driver.findElement(By.linkText("Images")).click();
			WebElement textbox = driver.findElement(By.name("q"));
	        textbox.sendKeys(Keys.RETURN);
			driver.findElement(By.name("q")).sendKeys(searchkey.toString());
		
			driver.findElement(By.xpath("//body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/button[1]/div[1]/span[1]/svg[1]")).click();
		

			System.out.println();
		}
		driver.close();
	

	}

}
