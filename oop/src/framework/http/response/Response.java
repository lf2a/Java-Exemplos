package framework.http.response;

import framework.http.request.Request;

import java.util.HashMap;

// classes abstratas não podem ser instanciadas
public abstract class Response implements IResponse {
    private HashMap<String, String> headers = new HashMap<>();
    private String body;

    public HashMap<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(HashMap<String, String> headers) {
        this.headers = headers;
    }

    public void setHeader(String key, String value) {
        this.headers.put(key, value);
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    // método estatico é um método que pertence a uma classe e não uma instância de uma classe
    public static boolean isAuthenticated(Request req) {
        String user = req.getHeaders().get("user");
        if (user.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public void send() {
        System.out.println("(Response.java) Enviando Conteudo...");
        System.out.println("(Response.java) Headers: " + this.headers.toString());
        System.out.println("(Response.java) Body: " + this.body.toString());
        System.out.println("Conteudo Enviado!");
    }
}
