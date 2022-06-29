package payroll.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;
@Data
@Entity
public class Cliente {
    //Variaveis
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;


    //Metodos get e setteres
    /*public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return getId() == cliente.getId();
    }

    @Override
    public int hashCode() {
        return 0;
    }*/
}
