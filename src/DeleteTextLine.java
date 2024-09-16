import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DeleteTextLine {
    public static String fileToString(String filePath) throws FileNotFoundException
    {
        String input = null;
        Scanner sc = new Scanner(new File(filePath));
        StringBuffer sb = new StringBuffer();
        while(sc.hasNextLine()){
            input = sc.nextLine();
            sb.append(input);
        }
        return sb.toString();
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "C://Users//Samyak//OneDrive//Desktop//Samplefile.txt";
        String result = fileToString(filePath);
        System.out.println("Contents of the file: "+result);
        result = result.replaceAll("\b6. Remove duplicate characters from string\b", "");
        PrintWriter writer = new PrintWriter(new File(filePath));
        writer.append(result);
        writer.flush();
        System.out.println("Content of the file after replacing the content");
        System.out.println(fileToString(filePath));
    }
    
}
