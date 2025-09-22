package entidades;

import java.time.LocalDateTime;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Livro extends PanacheEntityBase{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     public Integer codLivros;

     public LocalDateTime dataEmprestimo;

     public String tituloLivro;

     public String autorLivro;

     public Integer anoPublicacao;

     public String isbn;

    @ManyToOne
     public Editora editora;




}
