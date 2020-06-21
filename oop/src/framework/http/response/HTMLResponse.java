package framework.http.response;

// classes com a palavra chave final não pode ser herdada
public final class HTMLResponse extends Response {
    public HTMLResponse(String html) {
        super.setBody(html);
    }

    public void send() {
        System.out.println("(HTMLResponse.java) Modificando tipo do conteudo...");
        super.setHeader("Content-Type", "text/html");
        super.send();
    }
}
