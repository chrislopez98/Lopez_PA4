package com.company;


import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import java.io.IOException;
import java.util.HashSet;

// Problem 1: Problem 1 shall contain a public class called DuplicateRemover
public class DuplicateRemover {

    //The unique words should be stored in an instance (non static) variable called uniqueWords
    HashSet<String> uniqueWords = new HashSet<String>();
    // DuplicateRemover shall contain a method called remove
    public void remove(String dataFile) throws IOException {
        /* Create an instance method called remove that takes a single parameter
        called dataFile (representing the path to a text file) and uses a Set of Strings
        to eliminate duplicate words from dataFile.
         */
        //hashset of string to store unique words
        ////////Scanner inputStream = new Scanner(new File(dataFile));

        FileInputStream fileByteStream = null; // File input stream
        Scanner inFS = null;    // Scanner object
        System.out.println("Opening file problem1.txt.");
        fileByteStream = new FileInputStream(new File(dataFile));
        inFS = new Scanner(fileByteStream);
            //uniqueWords.add(inFS.next());
        while (inFS.hasNext()) {
            this.uniqueWords.add(inFS.next());
        }
        //check hashset
        /*
        Iterator<String> itr = uniqueWords.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

         */

            fileByteStream.close();
    }

        /*
        The remove method shall terminate the program and alert the user when an exceptional IO event occurs
         */

    public void write(String outputFile) throws IOException {
        File outFile = new File(outputFile);
        FileWriter fw = null;
        if (!outFile.exists()) {
            outFile.createNewFile();
            fw = new FileWriter(outFile);
        } else {
            fw = new FileWriter(outFile, false);
        }

        Iterator var4 = this.uniqueWords.iterator();

        while(var4.hasNext()) {
            String word = (String)var4.next();
            fw.write(word + "\n");
        }

        fw.close();
    }


    }








