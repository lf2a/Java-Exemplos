package testando;

import framework.controller.Controller;
import framework.http.request.Request;
import framework.http.response.HTMLResponse;
import framework.http.response.JsonResponse;
import framework.http.response.Response;

import java.util.HashMap;

public class MeuController extends Controller {
    @Override
    // sobrescrita
    public void get(Request req) {
        if (Response.isAuthenticated(req)) {
            System.out.println("(MeuController.java | GET /) Fazendo algo");

            HashMap<String, String> json = new HashMap<>();
            json.put("nome", "LUIZ FILIPY");

            new JsonResponse<HashMap>(json).send(json);
        } else {
            System.out.println("Usuario Não Autenticado");
            new JsonResponse<String>("").send("");
        }
    }

    @Override
    // sobrescrita
    public void post(Request req) {
        System.out.println("(MeuController.java | POST /) Fazendo algo");

        new HTMLResponse("").send();
    }

    @Override
    // sobrescrita
    public void put(Request req) {
        System.out.println("(MeuController.java | PUT /) Fazendo algo");

        HashMap<String, String> json = new HashMap<>();
        json.put("país", "brasil");

        new JsonResponse<HashMap>(json).send(json);
    }

    @Override
    // sobrescrita
    public void delete(Request req) {
        System.out.println("(MeuController.java | DELETE /) Fazendo algo");

        new HTMLResponse("").send();
    }
}
