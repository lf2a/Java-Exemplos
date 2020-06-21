package framework.http.response;

// classes com a palavra chave final não pode ser herdada
// veja sobre classes genericas
public final class JsonResponse<J> extends Response {
    private J body;

    public JsonResponse(J body) {
        this.body = body;
        // simulando um parse de um objeto para uma string
        this.setBody(this.body.toString());
    }

    // sobrecarga
    public void send(J body) {
        System.out.println("(JsonResponse.java) Modificando tipo do conteudo...");
        super.setHeader("Content-Type", "application/json");
        // chamando o metodo send() da super classe
        super.send();
    }
}
