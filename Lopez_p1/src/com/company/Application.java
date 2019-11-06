package com.company;


import java.io.IOException;


// Problem 1: Problem 1 shall contain a public class called Application
public class Application {


    // Problem 1: Application shall contain a main method
    //When using an InputStream, a programmer must append the clause throws IOException to the definition of main()
    public static void main(String[] args) throws IOException {
        // The main method shall create an instance of a DuplicateRemover called duplicateRemover
        DuplicateRemover duplicateRemover = new DuplicateRemover();
        /* The main method shall use the write method of duplicateRemover
         to output the unique words of "problem1.txt" to a file called "unique_words.txt"
         */
        duplicateRemover.remove("problem1.txt");
        duplicateRemover.write("unique_words.txt"); //




        //return 0;
    }


}
