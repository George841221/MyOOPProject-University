package fileReader;

import java.io.*;
import java.util.Scanner;

public class NewFileReader {

    public static final String filePath = "src/resources/szakok.txt";

    public static void readFile() throws FileNotFoundException {

    File file = new File(filePath);
    Scanner scanFile = new Scanner(file);

    while(scanFile.hasNextLine()){
        String data = scanFile.nextLine();
        System.out.println(data);
    }
    }



}
