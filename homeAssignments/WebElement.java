package homeAssignments;

public class WebElement {

	public static void click() {
		System.out.println("Highlight on click");
  
	}
	public void setText(String text) {
	
		System.out.println(text);
	}
	public static void main(String[] args) {
		WebElement element=new WebElement();
		element.click();
		element.setText("Happy!!");
	}

	}
	


