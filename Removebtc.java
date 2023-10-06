import java.io.File;
import java.io.IOException;

public class Removebtc {
    public static void main(String[] args) throws IOException {
        // Please note that modifying files on the user's computer without their consent is intrusive and potentially harmful.
        // This code is for demonstration purposes only, and you should obtain proper user consent before modifying files.

        // Provide the root directory you want to start file extension removal.
        String rootDirectory = "C:\\"; // Change this to your desired root directory.

        // Run the file extension removal procedure.
        removeFileExtensions(rootDirectory);
    }

    private static void removeFileExtensions(String directory) {
        File folder = new File(directory);

        // Iterate over all files and directories.
        for (File file : folder.listFiles()) {
            if (file.isFile()) {
                // Check if the file extension is ".bbxug" or the extension used for the virus.
                if (file.getName().endsWith(".bbxug")) {
                    // Remove the ".bbxug" extension by creating a new file with the original filename.
                    String newFileName = file.getName().replace(".bbxug", "");
                    File newFile = new File(file.getParent(), newFileName);
                    
                    // Rename the file.
                    file.renameTo(newFile);
                }
            } else if (file.isDirectory()) {
                // Recursively remove the file extensions within the subdirectories.
                removeFileExtensions(file.getAbsolutePath());
            }
        }
    }
}
