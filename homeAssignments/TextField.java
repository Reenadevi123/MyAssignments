package homeAssignments;

public class TextField extends WebElement{
public void getText() {
	System.out.println("The input text is : Are you ready??");
	
}
	public static void main(String[] args) {
	TextField textField=new TextField();
	textField.setText("Hello!!");
	textField.getText();
}
		

	}


