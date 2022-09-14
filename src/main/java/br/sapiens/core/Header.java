package br.sapiens.core;


import br.sapiens.controllers.layout.HeaderController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

import java.io.IOException;
import java.util.function.Function;

public class Header {

    public Node getHeader(Function<ViewEnum,Void> trocaTela) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Header.class.getResource("/layout/menuBarra.fxml"));
        Node node = fxmlLoader.load();
        Object controller = fxmlLoader.getController();
        if(controller instanceof HeaderController)
            ((HeaderController) controller).setCallBack(trocaTela);
        return node;
    }
}
