package danieleSanzari.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "elementi_generici")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ElementoGenerico {
    @Id
    @GeneratedValue
    protected UUID ISBN;
    protected String titolo;
    protected LocalDate annoDiUscita;
    protected int numeroPagine;

    @OneToMany(mappedBy = "elementoNoleggiato")
    private List<Prestito> listPrestiti = new ArrayList<>();

    public ElementoGenerico() {
    }

    public ElementoGenerico(String titolo, LocalDate annoDiUscita, int numeroPagine) {
        this.titolo = titolo;
        this.annoDiUscita = annoDiUscita;
        this.numeroPagine = numeroPagine;
    }

    public UUID getISBN() {
        return ISBN;
    }

    public List<Prestito> getListPrestiti() {
        return listPrestiti;
    }

    public int getAnnoDiUscita() {
        return annoDiUscita.getYear();
    }

    public void setAnnoDiUscita(LocalDate annoDiUscita) {
        this.annoDiUscita = annoDiUscita;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

}
