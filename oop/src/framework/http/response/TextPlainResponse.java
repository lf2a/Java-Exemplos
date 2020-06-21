package framework.http.response;

public class TextPlainResponse extends Response {
    public TextPlainResponse(String body) {
        super.setBody(body);
    }

    public void send() {
        System.out.println("(TextPlainResponse.java) Modificando tipo do conteudo...");
        super.setHeader("Content-Type", "text/plain");
        super.send();
    }
}
