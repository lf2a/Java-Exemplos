package framework.controller;

import framework.http.request.Request;

// classe abstrata não pode ser instanciada.
public abstract class Controller implements IController {
    public void get(Request req) {
        // faz algo
    }

    public void post(Request req) {
        // faz algo
    }

    public void put(Request req) {
        // faz algo
    }

    public void delete(Request req) {
        // faz algo
    }
}
