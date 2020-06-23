package io;

import java.io.File;
import java.io.IOException;

public class JFile {
    public static void arquivo() {
        try {
            File file = new File("/home/luiz/java.txt");

            // verifica se o arquivo existe
            System.out.println(file.exists());

            // cria um novo arquivo
            System.out.println(file.createNewFile());

            // retorna o tamanho do arquivo
            System.out.println(file.length());

            // renomeia um arquivo
            System.out.println(file.renameTo(new File("/home/luiz/java1.txt")));

            // exclui um arquivo
            System.out.println(file.delete());

            // verifica se é um arquivo
            System.out.println(file.isFile());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void diretorio() {
        File file = new File("/home/luiz/java/");

        // cria um diretorio
        System.out.println(file.mkdirs());

        // renomeia um diretorio
        System.out.println(file.renameTo(new File("/home/luiz/java-e")));

        // lista todos os arquivos em um diretorio
        System.out.println(file.list());

        // verifica se é um diretorio
        System.out.println(file.isDirectory());

        // apaga um diretorio
        System.out.println(file.delete());
    }

    public static void main(String[] args) {
        JFile.arquivo();
        JFile.diretorio();
    }
}
