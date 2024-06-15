package homeAssignments;

public class Button extends WebElement{

	public void submit(String string) {
		System.out.println("string");
		
	}
	
	public static void main(String[] args) {
		Button app=new Button();
		app.submit("Form is Submitted");
		WebElement.click();
		app.setText("click me if you are happy");

	}

}
