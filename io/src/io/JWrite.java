package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class JWrite {
    public static void write() {
        // para escrever caracteres utf-8/16 em um arquivo
        try (Writer writer = new FileWriter("/home/luiz/java.txt", true)) {
            char[] chars = new char[]{'A', 'á', 'C', 'D', 'ç', 'E'};
            writer.write(chars);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        JWrite.write();
    }
}
