package danieleSanzari.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;


@Entity
@Table(name = "prestiti")
public class Prestito {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "utente_id", nullable = false)
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "elemento_id", nullable = false)
    private ElementoGenerico elementoNoleggiato;
    private LocalDate dataInizioPrestito;
    private LocalDate dataFinePrestitoPrevista;
    private LocalDate dataFinePrestitoEffettiva;

    public Prestito() {
    }

    public Prestito(Utente utente, ElementoGenerico elementoNoleggiato, LocalDate dataInizioPrestito, LocalDate dataFinePrestitoEffettiva) {
        this.utente = utente;
        this.elementoNoleggiato = elementoNoleggiato;
        this.dataInizioPrestito = dataInizioPrestito;
        this.dataFinePrestitoPrevista = dataInizioPrestito.plusDays(30);
        this.dataFinePrestitoEffettiva = dataFinePrestitoEffettiva;
    }

    public LocalDate getDataFinePrestitoEffettiva() {
        return dataFinePrestitoEffettiva;
    }

    public void setDataFinePrestitoEffettiva(LocalDate dataFinePrestitoEffettiva) {
        this.dataFinePrestitoEffettiva = dataFinePrestitoEffettiva;
    }

    public LocalDate getDataFinePrestitoPrevista() {
        return dataFinePrestitoPrevista;
    }

    public void setDataFinePrestitoPrevista(LocalDate dataFinePrestitoPrevista) {
        this.dataFinePrestitoPrevista = dataFinePrestitoPrevista;
    }

    public LocalDate getDataInizioPrestito() {
        return dataInizioPrestito;
    }

    public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
        this.dataInizioPrestito = dataInizioPrestito;
    }

    public ElementoGenerico getElementoNoleggiato() {
        return elementoNoleggiato;
    }

    public void setElementoNoleggiato(ElementoGenerico elementoNoleggiato) {
        this.elementoNoleggiato = elementoNoleggiato;
    }

    public UUID getId() {
        return id;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "id=" + id +
                ", utente=" + utente +
                ", elementoNoleggiato=" + elementoNoleggiato +
                ", dataInizioPrestito=" + dataInizioPrestito +
                ", dataFinePrestitoPrevista=" + dataFinePrestitoPrevista +
                ", dataFinePrestitoEffettiva=" + dataFinePrestitoEffettiva +
                '}';
    }
}
