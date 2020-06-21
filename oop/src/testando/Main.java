package testando;

import framework.App;
import framework.http.request.Request;
import framework.router.Route;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        App app = new App("127.0.0.1", 8000);
        app.setRouter(new Route("/", new MeuController()));
        app.setRouter(new Route("/usuario", new MeuController2()));

        HashMap<String, String> query = new HashMap<String, String>();
        query.put("nome", "Luiz Filipy");

        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("user", "");
        headers.put("Token", "cernionirongi34ht895t-5g-45vi-");

        Request request = new Request(query, headers, "GET", "");

        app.run("/", request);
    }
}
