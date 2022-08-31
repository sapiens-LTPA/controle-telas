package br.sapiens.core;

public enum ViewEnum {
    Index("/views/index.fxml"),
    Tela1("/views/tela1.fxml"),
    Tela2("/views/tela2.fxml"),
    TelaErro("windson");

    final String tela;
    ViewEnum(String tela) {
        this.tela = tela;
    }
}
