package homeAssignments;

public class Radio_Button extends Button{
public void selectRadioButton() {
	System.out.println("The Radio button should be selected on click");
}
	public static void main(String[] args) {
		
    Radio_Button button=new Radio_Button();
    button.selectRadioButton();
    button.submit("your form is submitted");
	}

}
