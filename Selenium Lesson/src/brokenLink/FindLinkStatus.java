package brokenLink;




import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinkStatus {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\awalm\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0; i<links.size(); i++) {
		WebElement value = links.get(i);
		String linksurl = value.getAttribute("href");
		System.out.println("URL Links are : " + linksurl);
		if(linksurl != null) {
			verifyLinks(linksurl); // varifyLink will need to create method below
		}

		}

	}

	private static void verifyLinks(String checkurl) throws IOException {
		 //To verify the links
		URL url = new URL(checkurl);// this will ask Throw option
		HttpURLConnection httpConnect = (HttpURLConnection)url.openConnection();
		httpConnect.setConnectTimeout(3000);
		httpConnect.connect();
		
		if(httpConnect.getResponseCode()==200) {
			System.out.println(checkurl + " " + httpConnect.getResponseMessage());
		}else {
			if(httpConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(checkurl + " " + httpConnect.getResponseMessage());
			}
		}
		
	}
}
