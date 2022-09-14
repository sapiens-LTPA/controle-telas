package br.sapiens.controllers.layout;

import br.sapiens.MeuException;
import br.sapiens.core.Header;
import br.sapiens.core.ViewEnum;
import br.sapiens.core.ViewsBuilder;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MainController {

    private final ViewsBuilder viewsBuilder = new ViewsBuilder();
    @FXML
    private BorderPane painel;

    private Void trocaTela(ViewEnum tela){
        painel.setCenter(viewsBuilder.getPagina(tela));
        return null;
    }

    public void initialize() throws IOException {
        painel.setTop(new Header().getHeader(this::trocaTela));
        var label = new Label("Sapiens");
        MeuException.setLabel(label);
        painel.setBottom(label);
        trocaTela(ViewEnum.Index);
    }
}