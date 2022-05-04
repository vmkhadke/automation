package Browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get required browser executable path
				String path1="F:\\JavaWorkspace\\SeleniumPractice\\executables\\chromedriver.exe";
				String path2=".\\executables\\chromedriver.exe";
				String path3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
				//set required browser executable path using System.setProperty(String key,String value)
				System.setProperty("webdriver.chrome.driver", path2);
				//create an instance of required browser class
				ChromeDriver driver=new ChromeDriver();
				
			driver.get("https://www.google.com/");
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			String pageTitle=driver.getTitle();
			System.out.println("page title: "+pageTitle);
			String sourcecode=driver.getPageSource();
			System.out.println("application page source: "+sourcecode);
			System.out.println("application page source: "+sourcecode.length());
			
			//Thread.sleep(2000);
			
			driver.close();
	}

}
