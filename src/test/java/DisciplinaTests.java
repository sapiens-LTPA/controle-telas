import br.sapiens.modelo.Disciplina;
import br.sapiens.modelo.HorasDisciplina;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class DisciplinaTests {


    @Test
    public void nomeObrigatorio() throws Exception {
        boolean disciplinaPodeSerNull = true;
        boolean discplinapPodeSerVazio = true;
        try{
            Disciplina disciplinaDeveDarErro = new Disciplina(null, HorasDisciplina._20);
        }catch(Throwable t){
            disciplinaPodeSerNull = false; //A disciplina nao pode ser criada
        }
        if(disciplinaPodeSerNull)
            throw new Exception("A disciplina foi cadastrada com null");

        try{
            Disciplina disciplinaNomeVazio = new Disciplina("", HorasDisciplina._20);
        }catch(Throwable t){
            discplinapPodeSerVazio = false;
        }
        if(discplinapPodeSerVazio)
            throw new Exception("A disciplina foi inserida com valor vazio");
    }

    @Test
    public void nomeObrigatorioJunit() throws Exception {
        assertThrows(Throwable.class,() -> {
            Disciplina disciplnaNull = new Disciplina(null, HorasDisciplina._40);
            Disciplina disciplinaVazia = new Disciplina("", HorasDisciplina._40);
        });

        Disciplina disciplinaValida = new Disciplina("windson",  HorasDisciplina._40);
        assertThrows(Throwable.class,() -> {
            disciplinaValida.setNome(null);
        });



    }

    @Test
    public void disciplinaNumeroHoras() throws Exception {
        Disciplina disciplinaValida = new Disciplina("windson", HorasDisciplina._60);
    }


    /**
     * TODO Elaborar os testes em sala de aula
     *  2 - Uma diciclina deve conter um numero de horas - 20, 40, 60 ou 80
     *  3 - uma diciclina deve poder atender varios cursos (ciar enum para reduzir a complexidade)
     *  4 - Uma diciplina pode receber um aluno? Ou um aluno pode fazer uma diciplina?
     *  depende do desing escolido
     *
     *
     */

}
