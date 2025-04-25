import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "C:" +separator+ "Users" +separator+"User" + separator+ "Desktop"+separator+ "test.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.hasNextLine());
        }
    }
}
