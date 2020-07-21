package Test3;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test004 {

	public static void tec2() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\work\\chromedriver\\chromedriver.exe" ) ;
		ChromeDriver chrome = new ChromeDriver();
		String url="https://phantom-stg.golddishtech.com/user/login";
		chrome.get(url);
		//窗口最大化
		chrome.manage().window().maximize();
		// 获取当前的url
		String rl = chrome.getCurrentUrl();
	    System.out.println(rl);
	    chrome.findElementByCssSelector("#root > div > div > div > div > div > div > div > div:nth-child(1) > input").sendKeys("S00000000051");;
	    chrome.findElementByCssSelector("#root > div > div > div > div > div > div > div > div:nth-child(2) > input").sendKeys("Aa123456112");
	    chrome.findElementByXPath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div[3]/input").sendKeys("5458");
	    chrome.findElementByXPath("//*[@id=\"root\"]/div/div/div/div/div/div/div/span").click();
	    Thread.sleep(3000);
		
	}

	}


