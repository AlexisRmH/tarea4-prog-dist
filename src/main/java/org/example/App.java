package org.example;

public class App 
{
    public static void main( String[] args ) {
        TextFileManager currentTextFileManager = new TextFileManager("./createdFiles/");
        currentTextFileManager.createFile("file4");
        currentTextFileManager.writeContent("This is some content");
        currentTextFileManager.readFile();
        System.out.println("Absolute path: " + currentTextFileManager.getAbsolutePath());
    }
}
