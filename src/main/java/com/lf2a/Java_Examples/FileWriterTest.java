package com.lf2a.Java_Examples;

import java.io.FileWriter;

public class FileWriterTest {
public static void main(String[] args) throws Exception {
        try (FileWriter writer = new FileWriter("/Java-Examples/src/main/java/com/lf2a/Java_Examples/read.txt")) {
            for (int i = 0 ; i< 10;i++) {
                writer.write("luiz filipy");
            }
        }
    }
}
