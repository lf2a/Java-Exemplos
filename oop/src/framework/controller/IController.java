package framework.controller;

import framework.http.request.Request;

public interface IController {
    void get(Request req);

    void post(Request req);

    void put(Request req);

    void delete(Request req);
}
