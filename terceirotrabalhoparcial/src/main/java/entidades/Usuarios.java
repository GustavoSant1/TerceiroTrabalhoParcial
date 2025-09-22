package entidades;

import java.time.LocalDate;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Usuarios extends PanacheEntityBase {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     public Integer codUsuario;

    public String nomeUsuario;

    public String email;

    
    public LocalDate dataNascimento;




}
