package testando;

import framework.controller.Controller;
import framework.http.request.Request;
import framework.http.response.HTMLResponse;
import framework.http.response.JsonResponse;

import java.util.HashMap;

public class MeuController2 extends Controller {
    @Override
    // sobrescrita
    public void get(Request req) {
        System.out.println("(MeuController2.java | GET /usuario) Fazendo algo");

        HashMap<String, String> json = new HashMap<>();
        json.put("nome", "LUIZ FILIPY");

        new JsonResponse<HashMap>(json).send(json);
    }

    @Override
    // sobrescrita
    public void post(Request req) {
        System.out.println("(MeuController2.java | POST /usuario) Fazendo algo");

        new HTMLResponse("").send();
    }

    @Override
    // sobrescrita
    public void put(Request req) {
        System.out.println("(MeuController2.java | PUT /usuario) Fazendo algo");

        HashMap<String, String> json = new HashMap<>();
        json.put("país", "brasil");

        new JsonResponse<HashMap>(json).send(json);
    }

    @Override
    // sobrescrita
    public void delete(Request req) {
        System.out.println("(MeuController2.java | DELETE /usuario) Fazendo algo");

        new HTMLResponse("").send();
    }
}
