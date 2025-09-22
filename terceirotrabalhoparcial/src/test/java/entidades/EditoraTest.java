package entidades;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;



@QuarkusTest
public class EditoraTest {
    @Test
    @Transactional
   public void testSalvaUmanome() {
        Editora editora = new Editora();
        Editora.nomeEditora = "sbt";

        editora.persist();

        Assertions.assertEquals(3,editora.codEditora);
}
}