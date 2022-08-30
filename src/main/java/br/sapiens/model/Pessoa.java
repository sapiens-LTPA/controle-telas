package br.sapiens.model;

public class Pessoa {
    private final String nome;
    private final String sobreNome;
    private final String email;

    public Pessoa(String nome, String sobreNome, String email) throws Exception {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
        if(!email.contains("@"))
            throw new Exception("O email deve conter @");
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return nome+" "+sobreNome+" | "+email;
    }
}
