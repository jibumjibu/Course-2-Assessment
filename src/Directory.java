import java.io.File;
import java.io.IOException;

public class Directory {
	
	public String dirName;
	public String dirPath;
	public String filePath;
	public Directory(String dirName, String dirPath) {
		super();
		this.dirName = dirName;
		this.dirPath = dirPath;
		this.filePath = dirPath+"/"+dirName+"/";
	}
	
	/* creates new directory */
	public int createNewDir () {
		
		int validPathCheck;
		
		File file = new File(filePath);
		file.mkdir();
		if(file.exists()) {
			validPathCheck = 2;
			System.out.println("\n"+"Folder '"+dirName+"' created/exists"+"\n");
		}
			
		else
		{
			validPathCheck = 1;
			System.out.println("\n"+"Enter Valid Path"+"\n");
		}
		return validPathCheck;
	}
	
	/* creates new file */
	public void createNewFile(String fileName) throws IOException {
		File newFile = new File(filePath+fileName+".txt");
		newFile.createNewFile();
		System.out.println("\n"+"New File '" + fileName + "' is created in '" + dirName + "' folder"+"\n");
	}
	
	/* lists file content */
	public void folderContent () {
		File files = new File(filePath+"/");
		String[] f = files.list();
		
	    for (int i = 0; i < f.length; i++) {
             System.out.println(f[i]);
          }
		if (f.length == 0) {
			System.out.println("\n"+"Folder '" + dirName+"' is empty"+"\n");
		}
	}
	
	/* searches the requested file */
	public void fileSearch (String fileName) {
		File files = new File(filePath+fileName+".txt");
		if (files.exists() == true)
			System.out.println("\n"+"Found '" + fileName + "'");
		else
			System.out.println("\n"+"File '" + fileName + "' does not exist"+"\n");
		}
	
	/* deletes the requested file */
	public void fileDelete (String fileName) {
		File files = new File(filePath+fileName+".txt");
		if (files.exists() == false)
			System.out.println("\n"+"Files '" + fileName + "' does not exist"+"\n");
		else {
			files.delete();
			System.out.println("\n"+"File '" + fileName + "' is deleted"+"\n");
		}

	}
}

