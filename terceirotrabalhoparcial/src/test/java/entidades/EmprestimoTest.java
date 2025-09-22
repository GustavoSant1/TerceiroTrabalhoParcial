package entidades;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class EmprestimoTest {
    @Test
    @Transactional
   public void testSalvaUmEmprestimo() {
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.codEmprestimo = 1;
        emprestimo.dataEmprestimo = "2024-01-12";
        emprestimo.dataDevolucao = "2024-01-22";
        emprestimo.persist();

        Assertions.assertEquals(1,emprestimo.codEmprestimo);

}
}