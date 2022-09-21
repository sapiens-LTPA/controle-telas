package br.sapiens.modelo;

import br.sapiens.MeuException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Pessoa {
    private final String nome;
    private final String sobreNome;
    private final String email;
    private final List<Matricula> matriculas;
    private final CursosEnum curso;
    private ProfissaoEnum profissao;

    private List<Disciplina> disciplinas;
    private boolean bolsa = false;

    public Pessoa(String nome, String sobreNome, String email, CursosEnum curso ) throws MeuException {
        this.nome = nome;
        if(nome.isEmpty())
            throw new MeuException("Nome não pode ser null");
        if(sobreNome.isEmpty())
            throw new MeuException("Sobre nome não pode ser null");
        this.sobreNome = sobreNome;
        this.email = email;
        if(!Pattern.compile("^(.+)@(\\S+)$")
                .matcher(email)
                .matches())
            throw new MeuException("Email invalido");
        this.profissao = ProfissaoEnum.Nenhum;
        this.matriculas = new ArrayList();
        this.curso = curso;
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

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return nome+" "+sobreNome+" | "+email +
                " | "+curso+" | "+profissao+" | "+bolsa;
    }

    public boolean getBolsa() {
        return bolsa;
    }

    public void setBolsa(boolean b) {
        this.bolsa = b;
    }

    public CursosEnum getCurso() {
        return curso;
    }
}
