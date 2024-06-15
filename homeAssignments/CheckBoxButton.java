package homeAssignments;

public class CheckBoxButton extends Button{

	public void clickCheckButton() {
	System.out.println("Your option is selected");
}
	public static void main(String[] args) {
		CheckBoxButton check=new CheckBoxButton();
		check.clickCheckButton();
		check.submit("Your selection is saved");
		check.click();
		

	}

}
