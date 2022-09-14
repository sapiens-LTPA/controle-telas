package br.sapiens.controllers;

import br.sapiens.MeuException;
import br.sapiens.modelo.CursosEnum;
import br.sapiens.modelo.Pessoa;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class CadastroPessoaController {

    @FXML
    private TextField nome;
    @FXML
    private TextField sobreNome;
    @FXML
    private TextField email;

    public void salvar() {
        Pessoa pessoa = null;
        try {
            pessoa = new Pessoa(nome.getText(),sobreNome.getText(),email.getText(), CursosEnum.ESQUERDO);
        } catch (MeuException e) {
            e.mostrarAlert();
        }
        System.out.println(pessoa);
    }
}