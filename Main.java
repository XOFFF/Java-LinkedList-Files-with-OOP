package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        LinkedList<String> listOfData = new LinkedList<>();
        listOfData.add("Monika");
        listOfData.add("Pawel");
        listOfData.add("Kamil");

        FileOperationHelper fileOperationHelper = new FileOperationHelper();

        fileOperationHelper.saveData(listOfData);
        LinkedList<String> emptyList = fileOperationHelper.readFromFile();

        for (String s : emptyList) {
            System.out.println(s);
        }

    }
}
