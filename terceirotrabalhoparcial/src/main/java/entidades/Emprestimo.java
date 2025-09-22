package entidades;

import java.time.LocalDate;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Emprestimo extends PanacheEntityBase {
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     public Integer codEmprestimo;

     public LocalDate dataEmprestimo;

     public LocalDate dataDevolucao;

     @ManyToOne
     public Livro livro;
     @ManyToOne
     public Usuarios usuarios;
}
