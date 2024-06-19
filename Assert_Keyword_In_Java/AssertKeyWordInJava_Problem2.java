package selenium_Basic_And_locators;

public class AssertKeyWordInJava_Problem2 {

	public static void main(String[] args) {
		
		String name="";
		//System.out.println(name.length());
		assert name.length()>1;
		 
		System.out.println(name.concat(" is my name"));
	}
}


/*
OUTPUT--------------->
   java.lang.Assertion Error as my string length is 0 so it will not print


*/