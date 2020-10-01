package helpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHelper {
    public ArrayList<String> getDataFromFile() throws FileNotFoundException {
        ArrayList<String> output = new ArrayList<>();

        File file = new File("resource/res.txt");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
//            System.out.println(sc.nextLine());
            output.add(sc.nextLine());
        }

        return output;
    }
}
