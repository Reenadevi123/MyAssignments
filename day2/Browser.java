package week1.day2;

public class Browser {
public String launchBrowser(String browserName) {
	System.out.println("Browser Launched successfully");
	return browserName;
}
public void loadUrl() {
	System.out.println("Application URL Loaded Successfully");
}
	public static void main(String[] args) {
		Browser object= new Browser();
		object.launchBrowser("Chrome");
		object.loadUrl();
		
	}

}
