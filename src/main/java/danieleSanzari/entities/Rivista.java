package danieleSanzari.entities;


import danieleSanzari.enums.Periodicità;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("riviste")
public class Rivista extends ElementoGenerico {
    @Enumerated(EnumType.STRING)
    private Periodicità periodicità;

    public Rivista() {
    }

    public Rivista(String titolo, LocalDate annoDiUscita, int numeroPagine, Periodicità periodicità) {
        super(titolo, annoDiUscita, numeroPagine);
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
