package br.sapiens.controllers;

import br.sapiens.MeuException;
import br.sapiens.modelo.CursosEnum;
import br.sapiens.modelo.Pessoa;
import br.sapiens.modelo.ProfissaoEnum;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.util.List;

public class CadastroPessoaController {

    @FXML
    private TextField nome;
    @FXML
    private TextField sobreNome;
    @FXML
    private TextField email;

    @FXML
    private ChoiceBox cursoFormulario;

    @FXML
    private ChoiceBox<ProfissaoEnum> profissao;

    @FXML
    private CheckBox bolsa;

    @FXML
    public void initialize(){
        ObservableList<CursosEnum> cursosEnumFx = FXCollections
                .observableArrayList(CursosEnum.values());
        cursoFormulario.setItems(cursosEnumFx);


        ObservableList<ProfissaoEnum> profissoes = FXCollections
                .observableArrayList(ProfissaoEnum.values());
        //Onde tem enum.values() poderia ser reposito.findAllAtivos();
        profissao.setItems(profissoes);
    }

    public void salvar() {
        Pessoa pessoa = null;
        try {
            ProfissaoEnum profissaoSelecionado = profissao.getValue();
            CursosEnum cursoSelecionado = (CursosEnum) cursoFormulario.getValue();
            pessoa = new Pessoa(nome.getText(),sobreNome.getText(),email.getText(),cursoSelecionado);
            pessoa.setProfissao(profissaoSelecionado);
            pessoa.setBolsa(bolsa.isSelected());
        } catch (MeuException e) {
            e.mostrarAlert();
        } catch (Throwable t){
            new MeuException(t).mostrarAlert();
        }
        System.out.println(pessoa);
    }
}