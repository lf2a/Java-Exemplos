import java.nio.CharBuffer;

public class CharBufferExemplo {
    /*
     * https://docs.oracle.com/javase/8/docs/api/java/nio/CharBuffer.html
     * */
    public static void main(String[] args) {
        // allocate: define o tamanho do buffer
        CharBuffer buffer = CharBuffer.allocate(50);

        String text = "Luiz ";

        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);
            // put(char)
            buffer.put(c);
        }

        // put(String)
        buffer.put("Filipy");

        // tamanho restante do buffer
        System.out.println(buffer.length());

        int buffPos = buffer.position();
        System.out.println("posição atual do buffer: " + buffPos);

        // alterna um buffer do modo de gravação para o modo de leitura
        buffer.flip();

        while (buffer.hasRemaining()) {
            // le um caractere por vez
            System.out.println(buffer.get());
        }
    }
}
