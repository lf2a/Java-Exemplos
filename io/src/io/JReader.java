package io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class JReader {
    public static void read() {
        // usado para ler arquivos utf-8/16
        try (Reader reader = new FileReader("/home/luiz/java.txt")) {

            int read = reader.read();

            while (read != -1) {
                System.out.print((char) read);
                read = reader.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        JReader.read();
    }
}
