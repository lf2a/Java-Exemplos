package strings;

public class Strings {
    /*
     * Strings são imutaveis
     * */
    public static void charArrayParaString() {
        char[] ch = {'L', 'u', 'i', 'z'};
        String nome = new String(ch);

        System.out.println(nome);
    }

    public static void comparandoStrings() {
        String s1 = "Luiz";
        String s2 = "Luiz";
        String s3 = new String("Luiz");
        String s4 = "Filipy";
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s4)); // false

        /*
         * compareTo() compara valores lexicograficamente e retorna um valor inteiro que descreve
         * se a primeira string é menor que, igual ou maior que a segunda string.
         * */
        System.out.println(s1.compareTo(s2)); // 0
        System.out.println(s1.compareTo(s3)); // 1 (s1 > s3)
        System.out.println(s3.compareTo(s1)); // -1 (s3 < s1 )
    }

    public static void subString() {
        /*
         * Uma parte da string é chamada de substring. Em outras palavras, substring é um subconjunto de outra string.
         * No caso de substring, startIndex é inclusivo e endIndex é exclusivo.
         * */
        String s = "LuizFilipy";
        System.out.println(s.substring(6)); // lipy
        System.out.println(s.substring(0, 6)); // LuizFi
    }

    public static void maiusculaEMinuscula() {
        /*
         * toUpperCase(): transforma a string em maiuscula
         * toLowerCase(): transforma a string em minuscula
         * */
        String s = "Luiz";
        System.out.println(s.toUpperCase()); // LUIZ
        System.out.println(s.toLowerCase()); // luiz
        System.out.println(s); // Luiz
    }

    public static void trim() {
        /*
         * trim(): remove espaços em branco antes e depois da string, mas não remove espaços entre as palavras.
         * */
        String s = "  Luiz Filipy  ";
        System.out.println(s.trim()); // "Luiz Filipy"
        System.out.println(s); // "  Luiz Filipy  "
    }

    public static void startsWithEendsWith() {
        String s = "Filipy";
        System.out.println(s.startsWith("F")); // true
        System.out.println(s.endsWith("y")); // true
    }

    public static void charAt() {
        /*
         * charAt(): retorna o caractere em um determinado indice
         * */
        String s = "Luiz";
        System.out.println(s.charAt(1)); // u
        System.out.println(s.charAt(3)); // z
    }

    public static void tamanho() {
        String s = "Luiz Filipy";
        System.out.println(s.length()); // 11
    }

    public static void replace() {
        /*
         * O método replace() substitui toda a ocorrência da primeira sequência de caracteres
         * pela segunda sequência de caracteres.
         * */
        String s = "Java é uma Linguagem de programação";
        String novaString = s.replace("de programação", "para loucos. hahaha");
        System.out.println(s);
        System.out.println(novaString); // Java é uma Linguagem para loucos. hahaha
    }

    public static void contains() {
        /*
         * contains(): pesquisa a sequência de caracteres nesta sequência. Retorna true se a
         * sequência de valores de caracteres for encontrada nessa string, caso contrário, retornará false.
         * */
        String str = "Luiz Filipy Brasil";
        if (str.contains("Brasil")) {
            System.out.println("É Brasileiro!");
        } else {
            System.out.println("Não é brasileiro :(");
        }
    }

    public static void ignoreCase() {
        /*
         * equalsIgnoreCase(): compara as duas seqüências fornecidas com base no conteúdo da sequência,
         * independentemente do caso da sequência. É como o método equals(), mas não verifica o caso.
         * Se algum caractere não corresponder, ele retornará false, caso contrário, retornará true.
         * */
        String s1 = "javatpoint";
        String s2 = "javatpoint";
        String s3 = "JAVATPOINT";
        String s4 = "python";
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println(s1.equalsIgnoreCase(s3)); // true
        System.out.println(s1.equalsIgnoreCase(s4)); // false
    }

    public static void format() {
        /*
         * format(): retorna a string formatada pelo código de idioma, formato e argumentos fornecidos.
         * ref: https://www.javatpoint.com/java-string-format
         * */
        String name = "Luiz";
        String sf1 = String.format("name is %s", name);
        String sf2 = String.format("value is %f", 32.33434);
        String sf3 = String.format("value is %32.12f", 32.33434);

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
    }

    public static void getBytes() {
        // getBytes:() retorna a matriz de bytes da string. Em outras palavras, ele retorna a sequência de bytes
        String s = "Luiz Filipy";
        byte[] b = s.getBytes();
        for (byte by : b) {
            System.out.println(by);
        }
    }

    public static void join() {
        String date = String.join("/", "25", "06", "2018");
        System.out.print(date);
    }

    public static void lastIndexOf() {
        /*
         * lastIndexOf(): retorna o último índice do valor de caractere ou substring fornecido.
         * Se não for encontrado, ele retornará -1. O contador do índice começa do zero.
         * */
        String s = "Luiz Filipy";
        int index1 = s.lastIndexOf('i');
        System.out.println(index1); // 8
    }

    public static void split() {
        // split:() divide essa string com uma expressão regular especificada e retorna uma matriz de caracteres.
        String s = "Luiz Filipy";
        String[] words = s.split("\\s");

        for (String w : words) {
            System.out.println(w);
        }
    }

    public static void main(String[] args) {
        /*
         * Outros metodos:
         *
         * - O método valueOf() da string abrange um determinado tipo,
         *   como int, long, float, double, boolean, char e char array na string.
         *
         * */
        Strings.charArrayParaString();
        Strings.comparandoStrings();
        Strings.subString();
        Strings.maiusculaEMinuscula();
        Strings.trim();
        Strings.startsWithEendsWith();
        Strings.charAt();
        Strings.tamanho();
        Strings.replace();
        Strings.contains();
        Strings.ignoreCase();
        Strings.format();
        Strings.getBytes();
        Strings.join();
        Strings.lastIndexOf();
        Strings.split();
    }
}
