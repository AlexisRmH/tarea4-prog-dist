package org.example;

import java.io.*;
import java.util.Scanner;

public class TextFileManager {
    private File file;
    private String path;
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private Scanner scanner;

    public TextFileManager(String path) {
        this.path = path;
    }

    public void createFile(String fileName) {
        System.out.println(this.path + fileName + ".txt");
        File newFile = new File(this.path + fileName + ".txt");
        try{
            if(newFile.createNewFile()) {
                System.out.println("Created new file: " + newFile.getName());
            }
            this.file = newFile;
        } catch(IOException e) {
            System.out.println("Error while creating file: " + e.getMessage());
        }
    }

    public void writeContent(String content) {
        try {
            this.fileWriter = new FileWriter(this.file);

            this.bufferedWriter = new BufferedWriter(this.fileWriter);
            bufferedWriter.write(content);
            bufferedWriter.close();

            System.out.println("The content was added to the file successfully!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void readFile(){
        try {
            scanner = new Scanner(file);
            System.out.println("File's content: ");
            while (scanner.hasNextLine())
                System.out.println(scanner.nextLine());
            scanner.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public String getAbsolutePath() {
        return this.file.getAbsolutePath();
    }
}
