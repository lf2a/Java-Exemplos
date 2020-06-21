package framework.http.request;

import java.util.HashMap;

public class Request {
    private HashMap<String, String> query;
    private HashMap<String, String> headers;
    private String method;
    private String body;

    public Request(HashMap<String, String> query, HashMap<String, String> headers, String method, String body) {
        this.query = query;
        this.headers = headers;
        this.method = method;
        this.body = body;
    }

    public HashMap<String, String> getQuery() {
        return query;
    }

    public void setQuery(HashMap<String, String> query) {
        this.query = query;
    }

    public HashMap<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(HashMap<String, String> headers) {
        this.headers = headers;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
