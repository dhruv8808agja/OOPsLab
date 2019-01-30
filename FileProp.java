

import java.io.File;
import java.io.FileReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class FileProp {

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }

    public static void main(String[] args) throws Exception{
        System.out.println("Enter file path");
        String path;
        Scanner in = new Scanner(System.in);
        path = in.next();

        Path file = Paths.get(path);
        BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
        if (Files.exists(file)) {
            System.out.println("This file exist");
        }
        else {
            System.out.println("This file doesnt exist");
        }

        if(Files.isReadable(file.toAbsolutePath()))
        {
            System.out.println("File is readable");
        }
        else{
            System.out.println("File is not readable");
        }

        if(Files.isWritable(file.toAbsolutePath())){
            System.out.println("This file is writable");
        }
        else {
            System.out.println("This file is not writable");
        }

        File file1 = new File(path);
        System.out.println("File extension is :" + getFileExtension(file1));


        System.out.println("isDirectory      = " + attr.isDirectory());
        System.out.println("isOther          = " + attr.isOther());
        System.out.println("isRegularFile    = " + attr.isRegularFile());
        System.out.println("isSymbolicLink   = " + attr.isSymbolicLink());
        System.out.println("size             = " + attr.size());
    }
}
