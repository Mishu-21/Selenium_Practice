package selenium_Basic_And_locators;

public class AssertKeyWordInJava_Problem1
{
public static void main(String[] args) {
	
	
	
	
	//Try2
	
	/*
	 * int age=18; assert age>30; System.out.println("Go and vote"); //output go and
	 * vote----------->not as expected why this is happening
	 * 
	 * jab ki cojndition galat hai tab bhi why so???? because by default assert
	 * keyword is sleep so we need to make it up how to do that lets see
	 */
	
	
	//  video mai ---> 27:00  correct way ---->right click---> run as configuration --->argumnets---->type in vm arguments as  -ea(hyfen ea)
	//and now we will see assertion work
	int age=18;
	//synatx1 without msg --->assert age>30;
	//syntax 2 with msg 
	assert age>30:"We Want Minimum age as 18";
	System.out.println("Go and vote");
	
	/*OUTPUT------------------------------------------->
	  Exception in thread "main" java.lang.AssertionError
	 
	at selenium_Basic_And_locators.AssertKeyWordInJava.main(AssertKeyWordInJava.java:23)
*/
	
	/*TRy 1
	 * int age=18; assert age>10; System.out.println("Go and vote"); //output go and
	 * vote---> which is as expected
	 */


    }
}
