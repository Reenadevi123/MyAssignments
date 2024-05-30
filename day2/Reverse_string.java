package week1.day2;

public class Reverse_string {
public static String reverseString(String input) {
		
		
		String rev="";
		
      int len=input.length();
      char c;
      for(int i=0;i<input.length();i++) {
        c=input.charAt(i);
        rev=c+rev;
		
	}
      System.out.println("The reversed string is:"+rev);
      return rev;
}
	public static void main(String[] args) {
		Reverse_string word=new Reverse_string();
		String w= word.reverseString("TestLeaf") ;
		
	}

}
