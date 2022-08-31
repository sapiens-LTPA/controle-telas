package br.sapiens.controllers;

import br.sapiens.modelo.Pessoa;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CadastroPessoaController {

    @FXML
    private TextField nome;
    @FXML
    private TextField sobreNome;
    @FXML
    private TextField email;

    public void salvar(){
        Pessoa pessoa = new Pessoa(nome.getText(),sobreNome.getText(),email.getText());
        System.out.println(pessoa);
    }
}
