package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JBufferedWriter {
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/io-bufferedwriter-class-methods-java/
        // inicializando FileWriter
        try (FileWriter geek_file = new FileWriter("/home/luiz/java.txt")) {
            // inicializando BufferedWriter
            BufferedWriter geekwrite = new BufferedWriter(geek_file);
            System.out.println("Buffered Writer start writing :)");

            // escrever o valor 'ABC' no arquivo
            geekwrite.write("GEEKS");

            // For next line
            geekwrite.newLine();

            // Printing "FOR"
            geekwrite.write("FOR");

            // For next line
            geekwrite.newLine();

            // Printing "GEEKS"
            geekwrite.write("FOR");

            // Closing BufferWriter to end operation
            geekwrite.close();
            System.out.println("Written successfully");
        } catch (IOException excpt) {
            excpt.printStackTrace();
        }
    }
}
