package danieleSanzari.entities;

import danieleSanzari.enums.Genere;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@DiscriminatorValue("libri")
public class Libro extends ElementoGenerico {
    private String autore;
    private Genere genere;

    public Libro() {
    }

    public Libro(UUID ISBN, String titolo, LocalDate annoDiUscita, int numeroPagine, String autore, Genere genere) {
        super(ISBN, titolo, annoDiUscita, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN=" + ISBN + '\'' +
                ", autore='" + autore +
                ", genere=" + genere +
                ", annoDiUscita=" + annoDiUscita +
                ", numeroPagine=" + numeroPagine +
                ", titolo='" + titolo + '\'' +
                '}';
    }
}
