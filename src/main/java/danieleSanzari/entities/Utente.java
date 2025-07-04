package danieleSanzari.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "utenti")
public class Utente {
    @Id
    @GeneratedValue
    private UUID id;
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;
    private int numeroTessera;

    @OneToMany(mappedBy = "utente")
    private List<Prestito> prestitiUtente = new ArrayList<>();

    public Utente() {
    }

    public Utente(String nome, String cognome, LocalDate dataDiNascita, int numeroTessera) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.numeroTessera = numeroTessera;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public int getNumeroTessera() {
        return numeroTessera;
    }

    public void setNumeroTessera(int numeroTessera) {
        this.numeroTessera = numeroTessera;
    }

    public UUID getId() {
        return id;
    }

    public List<Prestito> getPrestitiUtente() {
        return prestitiUtente;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "cognome='" + cognome + '\'' +
                ", nome='" + nome + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", numeroTessera=" + numeroTessera +
                '}';
    }
}
