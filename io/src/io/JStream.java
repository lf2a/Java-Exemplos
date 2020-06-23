package io;

import java.io.*;
import java.nio.charset.Charset;

public class JStream {
    public static void input() {
        /*
         * A classe java.io.InputStream é a classe base para todos os fluxos de entrada do Java IO.
         * Se você estiver escrevendo um componente que precisa ler a entrada de um fluxo, tente fazer nosso
         * componente depender de um InputStream, em vez de qualquer uma de suas subclasses
         * (por exemplo, FileInputStream). Fazer isso torna seu código capaz de trabalhar com todos os tipos de
         * fluxos de entrada, em vez de apenas na subclasse concreta.
         *
         * ref: https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html
         * */

        try (InputStream is = new FileInputStream("/home/luiz/java.txt")) {
            InputStreamReader isr = new InputStreamReader(is, Charset.forName("UTF-8"));
            int data = isr.read();

            while (data != -1) {
                System.out.print((char) data);
                data = isr.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void output() {
        /*
         * A classe java.io.OutputStream é a classe base de todos os fluxos de saída do Java IO.
         * Se você estiver gravando um componente que precisa gravar a saída em um fluxo, tente garantir
         * que esse componente dependa de um OutputStream e não de uma de suas subclasses.
         *
         * ref: https://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html
         * */

        try (OutputStream os = new FileOutputStream("/home/luiz/java.txt")) {
            OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
            char[] c = "Olá Mundo".toCharArray();
            osw.write(c);
            osw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
//        JStream.input();
        JStream.output();
    }
}
