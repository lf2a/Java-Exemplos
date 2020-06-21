package framework;

import framework.http.request.Request;
import framework.router.Route;

import java.util.ArrayList;
import java.util.List;

public class App {
    private String host;
    private int porta;
    private boolean isHttps;
    private List<Route> route = new ArrayList<>();

    public App(String host, int porta, boolean isHttps) {
        this.host = host;
        this.porta = porta;
        this.isHttps = isHttps;
    }

    public App(String host, int porta) {
        this.host = host;
        this.porta = porta;
    }

    public void setRouter(Route r) {
        this.route.add(r);
    }

    public List<Route> getRouter() {
        return this.route;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public boolean isIsHttps() {
        return isHttps;
    }

    public void setIsHttps(boolean isHttps) {
        this.isHttps = isHttps;
    }

    public void run(String path, Request req) {
        for (Route r : this.route) {
            if (path.equals(r.getPath())) {
                if (req.getMethod().equals("GET")) {
                    r.getController().get(req);
                } else if (req.getMethod().equals("POST")) {
                    r.getController().post(req);
                } else if (req.getMethod().equals("PUT")) {
                    r.getController().put(req);
                } else if (req.getMethod().equals("DELETE")) {
                    r.getController().delete(req);
                } else {
                    System.err.println("Metodo não conhecido");
                }
            }
        }
    }
}
