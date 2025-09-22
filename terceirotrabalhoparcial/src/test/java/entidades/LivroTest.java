package entidades;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class LivroTest {
    @Test
    @Transactional
   public void testSalvaUmLivro() {
        Livro livro = new Livro();
        livro.codLivros = 1;
        livro.tituloLivro = "Java Básico";
        livro.autorLivro = "João Silva";
        livro.anoPublicacao = 2020;
        livro.isbn = "1111111111";
        livro.persist();

        Assertions.assertEquals(1,livro.codLivros);

}
}