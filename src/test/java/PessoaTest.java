import br.sapiens.modelo.Pessoa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

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
}
