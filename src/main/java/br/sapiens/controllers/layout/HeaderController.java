package br.sapiens.controllers.layout;

import br.sapiens.core.ViewEnum;
import javafx.fxml.FXML;

import java.io.IOException;
import java.util.function.Function;

public class HeaderController {

    private Function<ViewEnum,Void> callBack = (tela) -> {return null;};

    public void setCallBack(Function<ViewEnum, Void> callBack) {
        this.callBack = callBack;
    }

    @FXML
    public void tela1(){
        callBack.apply(ViewEnum.Tela1);
    }

    @FXML
    public void tela2(){
        callBack.apply(ViewEnum.Tela2);
    }

    @FXML
    public void initialize() throws IOException {

    }
}