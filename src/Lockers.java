
import java.io.IOException;
import java.util.Scanner;

public class Lockers {

	public static void main(String[] args) throws IOException {
		
		String dirPath = "";
		String dirName = "";
		String fileName;
		String optionSelected = "";
		int level = 1;
		int endSession = 0;
		
		try (Scanner scan = new Scanner(System.in)) {

			Session newSession = new Session();
			newSession.welcomeScreen(); /* command displays the welcome screen with application and developer names */
			
			while (endSession == 0)
			{
				while (level == 1) {
					
					System.out.println("Enter path of new/existing folder");
					dirPath = scan.nextLine();		
					System.out.println("Enter name of new/existing folder");
					dirName = scan.nextLine();
					level = 2;
				}
				
					Directory dirObj = new Directory(dirName, dirPath); // object of class Directory created
					level = dirObj.createNewDir(); // new directory is created or goes into existing directory
				
				while (level == 2) {
					newSession.firstOption(); // Displays first option
					optionSelected = scan.nextLine();
					switch(optionSelected) {
					case "1": level = 3; break;
					case "2": level = 3; break;
					case "3": level = 3; break;
					default : System.out.println("Enter a valid selection"+ "\n");level = 2; break;
					}
				}
					
				while (level == 3) {
					
					switch (optionSelected) {
					case "1": dirObj.folderContent(); // lists folder content in alphabetical order
							  newSession.thirdOption(); // displays third option (close application or previous menu)
					  		  optionSelected = scan.nextLine();
					          level = 4;
							  break;
					case "2": newSession.secondOption(); // displays second option (add, delete, search)
							  optionSelected = scan.nextLine();
							  int validInput = 0;
							  while (validInput == 0) {
									switch (optionSelected) {
									case "1": System.out.println("Enter new File Name");
											  fileName = scan.nextLine();
											  dirObj.createNewFile(fileName); // add new file
											  newSession.thirdOption();
											  optionSelected = scan.nextLine();
											  level = 4;
											  validInput = 1;
											  break;
									case "2": dirObj.folderContent(); 
									          newSession.thirdOption(); // displays third option (close application or previous menu)
							  		          optionSelected = scan.nextLine();
							                  level = 4;
							                  validInput = 1;
									          break;
									case "3": System.out.println("Enter File Name to delete");
									          fileName = scan.nextLine();
									          dirObj.fileDelete(fileName); // delete existing file
									          newSession.thirdOption();
									          optionSelected = scan.nextLine();
									          level = 4;
									          validInput = 1;
									          break;
									case "4": System.out.println("Enter File Name to search");
									          fileName = scan.nextLine();
									          dirObj.fileSearch(fileName); // search file
									          newSession.thirdOption();
									          optionSelected = scan.nextLine();
									          level = 4;
									          validInput = 1;
									          break;
									case "5": System.out.println("\n"+"**APPLICATION CLOSED**");//#5 of second option 
								              endSession = 1;
								              validInput = 1;
								              level = 0;
								              break;
									default:  System.out.println("Enter a valid selection"+ "\n");
											  newSession.secondOption();
									          optionSelected = scan.nextLine(); 
									          break;
									 }
							  }
							  break;
					case "3": System.out.println("\n"+"**APPLICATION CLOSED**"); endSession = 1; level = 0; break;// #3 of first option
					}
					
				}
				
				while (level == 4) {
					switch (optionSelected) {
					case "1": level = 1; break;
					case "2": level = 3; break;
					case "3": System.out.println("\n"+"**APPLICATION CLOSED**"); endSession = 1; level = 0; break;
					default: System.out.println("Enter a valid selection"+ "\n"); 
			          		 newSession.thirdOption();
			          		 optionSelected = scan.nextLine();
			          		 break;
					}
				}
				

			}
		}
		catch (Exception e) {
			System.out.println("INVALID ENTRY. PLEASE RESTART THE APPLICATION");
		}
	}
}
//C:\Users\johnm\OneDrive\Desktop/