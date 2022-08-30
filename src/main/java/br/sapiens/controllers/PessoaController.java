package br.sapiens.controllers;

import br.sapiens.model.Pessoa;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Window;

public class PessoaController {

    @FXML
    AnchorPane anchor;

    @FXML
    TextField nome;

    @FXML
    TextField sobreNome;

    @FXML
    TextField email;

    public void salvar(){
        try{
            Pessoa pessoa = new Pessoa(nome.getText(),sobreNome.getText(),email.getText());
            System.out.println("Salvando pessoa: "+pessoa);
        }catch (Exception e){
            showAlert(Alert.AlertType.ERROR,"Erro",e.getMessage());
        }
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(anchor.getScene().getWindow());
        alert.show();
    }
}
