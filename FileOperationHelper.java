package com.company;
import java.util.Scanner;
import java.io.*;
import java.util.LinkedList;

public class FileOperationHelper {

    Scanner scan = new Scanner(System.in);


    File file = new File("Array.txt");

    public void saveData(LinkedList<String> list) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        System.out.println("File created!");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File exists");
        }

        for(int i = 0; i < list.size(); i++){
            fileWriter.write(list.get(i) + "\n");
        }
        fileWriter.close();
    }

    public LinkedList<String> readFromFile() throws IOException {
        LinkedList<String> list = new LinkedList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line=bufferedReader.readLine()) != null){
            list.add(line);
        }
        return list;
    }
}
