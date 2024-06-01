package Task6;

import  java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {

    public static String inputString(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Write line: ");
       return scanner.nextLine();
   }
    public static void fileInput(String path,String line) throws IOException {
        File file = new File(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(line.getBytes());
    }

    public  static void fileOutput(String path) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(path);
        int i;
        while((i=fileInputStream.read())!=-1){
            if (i==' ') i='_';
            System.out.print((char)i);
        }
    }

    public static void main(String[] args) throws IOException {
       String line = inputString();
       String path = "Task6/tms.txt";
       fileInput(path,line);
       fileOutput(path);
    }

}
