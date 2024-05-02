import java.io.File;
import java.io.IOException;

public class ProcessDemo {
    public static void main(String[] args) {
        String command = "ls";
        String directory = "/Users/urmil/Projects/Java-Bootcamp/abc";
        ProcessBuilder processBuilder = new ProcessBuilder(command);
        processBuilder.directory(new File(directory));
        try {
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            System.out.println("Process exited with code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
