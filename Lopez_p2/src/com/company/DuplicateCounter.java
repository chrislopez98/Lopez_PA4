package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class DuplicateCounter {

    HashMap<String,Integer> wordCounter = new HashMap<String,Integer>();

    public void count(String dataFile) throws IOException {

        ////////Scanner inputStream = new Scanner(new File(dataFile));

        FileInputStream fileByteStream = null; // File input stream
        Scanner inFS = null;    // Scanner object
        System.out.println("Opening file problem2.txt.");
        fileByteStream = new FileInputStream(new File(dataFile));
        inFS = new Scanner(fileByteStream);
        //uniqueWords.add(inFS.next());
        while (inFS.hasNext()){
            String word = inFS.next();
            if (wordCounter.containsKey(word)){ //multiple +1
                wordCounter.put(word,wordCounter.get(word) + 1);
            }
            else{
                wordCounter.put(word,1); //first instance
            }
        }
        //check hashmap
        /*
        Iterator<String> itr = uniqueWords.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

         */

        fileByteStream.close();
    }

    public void write(String outputFile) throws IOException{
        File outFile = new File(outputFile);
        FileWriter fw = null;

        //check if created
        if (!outFile.exists()){
            outFile.createNewFile();
            fw = new FileWriter(outFile);
        }
        else{
            fw = new FileWriter(outFile,false);
        }

        //fill data
        for (Entry<String, Integer> entry : wordCounter.entrySet()){
            fw.write(entry.getKey() + ": " + entry.getValue()+"\n");
        }

        fw.close();
    }












}
