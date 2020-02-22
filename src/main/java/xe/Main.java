package xe;

import xe.Controller.Controller;
import xe.Model.Model;
import xe.View.View;

public class Main {
    public static void main(String[] args){
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();



    }
}
