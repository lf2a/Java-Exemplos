import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ByteBufferExemplo {
    public static void main(String[] args) throws IOException {

        String testFile = "/home/luiz/java.txt";
        Path filePath = Paths.get(testFile);

        readFile(filePath);
    }

    private static void readFile(Path filePath) throws IOException {
        /*
        * https://docs.oracle.com/javase/8/docs/api/java/nio/ByteBuffer.html
        * */

        FileChannel readChannel = FileChannel.open(filePath);

        // size(): tamanho do arquivo
        ByteBuffer readBuffer = ByteBuffer.allocate((int)readChannel.size());
        int noOfBytesRead = readChannel.read(readBuffer);
        System.out.println("Bytes lidos: " + noOfBytesRead);

        byte[] bytes = readBuffer.array();
        String output = new String(bytes).trim();

        System.out.println(output);

        // limpa o buffer
        // readBuffer.clear()

        // transfere todos os dados não lidos para o início do Buffer
        // readBuffer.compact();

        readChannel.close();
    }
}
