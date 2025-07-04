package danieleSanzari.entities;


import danieleSanzari.enums.Periodicità;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@DiscriminatorValue("riviste")
public class Rivista extends ElementoGenerico {
    private Periodicità periodicità;

    public Rivista() {
    }

    public Rivista(UUID ISBN, String titolo, LocalDate annoDiUscita, int numeroPagine, Periodicità periodicità) {
        super(ISBN, titolo, annoDiUscita, numeroPagine);
        this.periodicità = periodicità;
    }

    public Periodicità getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Periodicità periodicità) {
        this.periodicità = periodicità;
    }

    @Override
    public String toString() {
        return "Rivista{" +
                "ISBN=" + ISBN + '\'' +
                ", titolo='" + titolo +
                ", numeroPagine=" + numeroPagine +
                ", annoDiUscita=" + annoDiUscita +
                ", periodicità=" + periodicità +
                '}';
    }
}
