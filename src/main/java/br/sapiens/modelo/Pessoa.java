package br.sapiens.modelo;

public class Pessoa {
    private final String nome;
    private final String sobreNome;
    private final String email;

    public Pessoa(String nome, String sobreNome, String email){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
    }

    @Override
    public String toString() {
        return nome+" "+sobreNome+" | "+email;
    }
}
