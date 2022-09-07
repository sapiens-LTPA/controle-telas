import br.sapiens.modelo.Disciplina;
import br.sapiens.modelo.Pessoa;
import br.sapiens.modelo.ProfissaoEnum;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    public void criaPessoaValida(){
        new Pessoa("Windson","Gadelha","windson@gmail.com");
    }

    @Test
    public void naoPermitePessoaSemNome(){
        assertThrows(Throwable.class,() -> {
            new Pessoa(null,"Gadelha","windson@gmail.com");
            new Pessoa("","Gadelha","windson@gmail.com");
        });
    }

    @Test
    public void naoPermitePessoaSemSobreNome(){
        assertThrows(Throwable.class,() -> {
            new Pessoa("windson",null,"windson@gmail.com");
            new Pessoa("windson","","windson@gmail.com");
        });
    }

    @Test
    public void deveTerEmailValido(){
        assertThrows(Throwable.class,() -> {
            new Pessoa("Windson","Gadelha","windson");
            new Pessoa("Windson","Gadelha","@");
            new Pessoa("Windson","Gadelha","windson@gmail");
            new Pessoa("Windson","Gadelha","windson@.com");
        });
    }

    @Test
    public void profissaoPadraoDeveSerNenhum(){
        //TODO criar um enum de profissoes
        var pessoa = new Pessoa("Windson","Gadelha","windson@.com");
        assertTrue(pessoa.getProfissao().equals(ProfissaoEnum.Nenhum));
    }

    @Test
    public void naoDeveConterNenhumaDisciplinaEmPessoa(){
        //TODO criar a propriedade disciplina e relacionar com o objeto diciplina!
        // Elaborar uma forma de represemtar o aluno na diciplina
        // Existe uma palavra epecial para essa relação aluno - diciplina
        // Matricula
        var pessoa = new Pessoa("Windson","Gadelha","windson@.com");
        assertTrue(pessoa.getDisciplinas().size() == 0);
    }

    @Test
    public void pessoaTemBolsa(){
        //TODO criar uma propriedade boleana
        // que informa se esse aluno tem bolsa de estudos, padrão falso
        var pessoa = new Pessoa("Windson","Gadelha","windson@.com");
        assertFalse(pessoa.getBolsa());
        pessoa.setBolsa(true); //Estou dando uma bolsa para o auno
        assertTrue(pessoa.getBolsa());
    }

    @Test
    public void pessoaSempreTerCurso(){
        //TODO criar uma propriedade curso em pessoa
        // validar que a pessoa nunca tenha curso == null
        // Curso pode ser um enum, coloque duas opções, sistemas e direito
        var pessoa = new Pessoa("Windson","Gadelha","windson@.com");
        assertTrue(pessoa.getCurso() != null);
    }

    @Test
    public void pessoaNaoPodeFazerDiciplinaOutroCurso(){
        //TODO criar uma propriedade pessoa
        // validar que a pessoa nunca tenha curso = null

        //Fazer a interface para adcionar pessoas a um curso -- depois de fazer a UI
    }
}
