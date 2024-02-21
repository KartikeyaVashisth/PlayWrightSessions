package playwrightsessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlayWrightBasics {

	public static void main(String[] args) {

//		Playwright pw = Playwright.create();
//		
//		Browser browser = pw.chromium().launch(); //This will launch chromium browser using the Chromium binary.
//		Page page = browser.newPage(); //To get the page context
//		
//		page.navigate("https://www.amazon.com");
//		String title = page.title();
//		System.out.println("Page Title is: "+ title);
//		
//		browser.close(); //To close the browser
//		pw.close(); //To close the Playwright server
		
		/** 
		 * To Launch the browser in the Non Headless mode.
		 */
//		Playwright pw = Playwright.create();
//		
//		Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)); //This will launch chromium browser using the Chromium binary in Non Headless mode..
//		Page page = browser.newPage(); //To get the page context
//		
//		page.navigate("https://www.amazon.com");
//		String title = page.title();
//		System.out.println("Page Title is: "+ title);
//		
//		browser.close(); //To close the browser
//		pw.close(); //To close the Playwright server
		
		
		/** 
		 * To Launch the Chrome or Edge browser in the Non Headless mode.
		 */
		
		Playwright pw = Playwright.create();
		LaunchOptions lp = new LaunchOptions();
		lp.setChannel("chrome"); //msedge for the Edge Browser
		lp.setHeadless(false);
		
		Browser browser = pw.chromium().launch(lp); //This will launch chrome browser using the Chromium binary in Non Headless mode..
		Page page = browser.newPage(); //To get the page context
		
		page.navigate("https://www.amazon.com");
		String title = page.title();
		System.out.println("Page Title is: "+ title);
		
		browser.close(); //To close the browser
		pw.close();
	}

}
