package strings;

public class StringBufferExemplo {
    /*
     * A classe Java StringBuffer é usada para criar uma sequência mutável (modificável).
     * A classe StringBuffer em java é igual à classe String, exceto que é mutável, ou seja, pode ser alterada.
     * */
    public static void anexar() {
        // append(): concatena o argumento fornecido com essa string.
        StringBuffer sb = new StringBuffer("Olá ");
        sb.append("Mundo");
        System.out.println(sb); // Olá Mundo
    }

    public static void inserir() {
        // insert(): insere a sequência especificada com essa sequência na posição especificada.
        StringBuffer sb = new StringBuffer("Luiz");
        sb.insert(1, "Filipy");
        System.out.println(sb); // LFilipyuiz
    }

    public static void replace() {
        // replace(): substitui a sequência especificada dos beginIndex e endIndex especificados.
        StringBuffer sb = new StringBuffer("Filipy");
        sb.replace(1, 3, "abcde");
        System.out.println(sb); // Fabcdeipy
    }

    public static void delete() {
        // delete(): da classe StringBuffer exclui a sequência do beginIndex especificado para o endIndex.
        StringBuffer sb = new StringBuffer("Filipy");
        sb.delete(1, 3);
        System.out.println(sb); // Fipy
    }

    public static void reverse() {
        // reverse(): da classe StringBuilder reverte a string atual.
        StringBuffer sb = new StringBuffer("Filipy");
        sb.reverse();
        System.out.println(sb); // ypiliF
    }

    public static void capacidade() {
        /*
         * capacity:() da classe StringBuffer retorna a capacidade atual do buffer.
         * A capacidade padrão do buffer é 16. Se o número de caracteres aumentar em relação à
         * sua capacidade atual, ele aumenta a capacidade em (capacidadeAntiga * 2) + 2. Por exemplo,
         * se sua capacidade atual for 16, será (16 * 2) + 2 = 34.
         * */
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // padrão 16

        sb.append("Luiz");
        System.out.println(sb.capacity()); // agora 16

        sb.append("java Brasil 2020");
        System.out.println(sb.capacity()); // (CapacidadeAntiga * 2) + 2 = 34
    }

    public static void ensureCapacity() {
        /*
        * sureCapacity(): da classe StringBuffer garante que a capacidade fornecida seja o mínimo
        * para a capacidade atual. Se for maior que a capacidade atual, aumenta a capacidade em
        * (capacidade antiga * 2) + 2. Por exemplo, se sua capacidade atual for 16, será (16 * 2) + 2 = 34.
        * */
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // padrão 16

        sb.append("Luiz");
        System.out.println(sb.capacity()); // agora 16

        sb.append("Java Brasil 2020");
        System.out.println(sb.capacity()); // (CapacidadeAntiga * 2) + 2 = 34

        sb.ensureCapacity(10); // now no change
        System.out.println(sb.capacity()); // agora 34

        sb.ensureCapacity(50); // agora (34*2)+2
        System.out.println(sb.capacity()); // agora 70
    }

    public static void main(String[] args) {
        StringBufferExemplo.anexar();
        StringBufferExemplo.inserir();
        StringBufferExemplo.replace();
        StringBufferExemplo.delete();
        StringBufferExemplo.reverse();
        StringBufferExemplo.capacidade();
        StringBufferExemplo.ensureCapacity();
    }
}
