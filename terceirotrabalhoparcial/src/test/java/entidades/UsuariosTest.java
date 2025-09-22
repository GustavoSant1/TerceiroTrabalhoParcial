package entidades;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class UsuariosTest {
    @Test
    @Transactional
   public void testSalvaUmUsuario() {
        Usuarios usuario = new Usuarios();
        usuario.codUsuario = 1;
        usuario.nomeUsuario = "Lucas Pereira";
        usuario.email = "lucas@gmail.com";

}
   }