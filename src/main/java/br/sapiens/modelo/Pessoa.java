package br.sapiens.modelo;

import java.util.List;

public class Pessoa {
    private final String nome;
    private final String sobreNome;
    private final String email;
    private ProfissaoEnum profissao;

    private List<Disciplina> disciplinas;

    public Pessoa(String nome, String sobreNome, String email){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
        this.profissao = profissao;
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

    public ProfissaoEnum getProfissao() {
        return profissao;
    }

    public void setProfissao(ProfissaoEnum profissao) {
        this.profissao = profissao;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return nome+" "+sobreNome+" | "+email;
    }

    public boolean getBolsa() {
        return true;
    }

    public void setBolsa(boolean b) {
    }

    public CursosEnum getCurso() {
        return null;
    }
}
