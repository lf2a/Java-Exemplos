package framework.router;

import framework.controller.Controller;

public class Route {
    private String path;
    private Controller controller;

    public Route(String path, Controller controler) {
        this.path = path;
        this.controller = controler;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }


}
