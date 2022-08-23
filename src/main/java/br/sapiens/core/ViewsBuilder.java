package br.sapiens.core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class ViewsBuilder {

    public Node getPagina(ViewEnum views){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(ViewsBuilder.class.getResource(views.tela));
            return fxmlLoader.load();
        } catch (Throwable e) {
            e.printStackTrace();
            return new Pane(new Label("Erro ao carregar tela! "+e.getMessage()));
        }
    }
}
