

public class Session {
	
	/* displays welcome screen */
	public void welcomeScreen() {
		System.out.println("Application name: File Manager");
		System.out.println("Developer: Jibu John");
		System.out.println("----------------------------------");
		System.out.println();
	}
	
	/* displays first option */
	public void firstOption() {
		
		System.out.println("PRESS 1 : View files in the folder");
		System.out.println("PRESS 2 : Manage Files");
		System.out.println("PRESS 3 : End the session");
	}
	
	/* displays second option */
	public void secondOption() {
		
		System.out.println("PRESS 1 : Add Files");
		System.out.println("PRESS 2 : View files in the folder");
		System.out.println("PRESS 3 : Delete Files");
		System.out.println("PRESS 4 : Search Files");
		System.out.println("PRESS 5 : End the session");
	}
	
	/* display third option */ 
	public void thirdOption() {
		System.out.println("\n"+"PRESS 1 : Change/create directory");
		System.out.println("PRESS 2 : Manage files in current directory");
		System.out.println("PRESS 3 : Close Application");
	}
}
