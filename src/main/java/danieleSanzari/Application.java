package danieleSanzari;

import danieleSanzari.DAO.ElementoGenericoDAO;
import danieleSanzari.DAO.PrestitoDAO;
import danieleSanzari.DAO.UtenteDAO;
import danieleSanzari.entities.Libro;
import danieleSanzari.entities.Prestito;
import danieleSanzari.entities.Rivista;
import danieleSanzari.entities.Utente;
import danieleSanzari.enums.Genere;
import danieleSanzari.enums.Periodicità;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4-w3-d5-project-pu");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        ElementoGenericoDAO egd = new ElementoGenericoDAO(em);
        UtenteDAO ud = new UtenteDAO(em);
        PrestitoDAO pd = new PrestitoDAO(em);

        Libro libro = new Libro("Il signore degli anelli", LocalDate.of(1970, 1, 15), 1490, "J.R.R.Tolkien", Genere.FANTASY);
        Libro libro2 = new Libro("Il signore degli anelli 2", LocalDate.of(1973, 11, 8), 2290, "J.R.R.Tolkien", Genere.FANTASY);
        Libro libro3 = new Libro("Il signore degli anelli 3", LocalDate.of(1978, 12, 31), 1998, "J.R.R.Tolkien", Genere.FANTASY);

        Rivista rivista = new Rivista("Novella2000 prima uscita", LocalDate.of(2004, 5, 19), 100, Periodicità.MENSILE);
        Rivista rivista2 = new Rivista("Dipiù prima uscita", LocalDate.of(2006, 7, 10), 100, Periodicità.MENSILE);
        Rivista rivista3 = new Rivista("Settimanale Nuovo prima uscita", LocalDate.of(2010, 9, 30), 150, Periodicità.SETTIMANALE);

        /*egd.save(libro);
        egd.save(libro2);
        egd.save(rivista);
        egd.save(rivista2);
        egd.save(libro3);
        egd.save(rivista3);*/

        Utente marco = new Utente("Marco", "Rossi", LocalDate.of(1989, 6, 14), 99903);
        Utente laura = new Utente("Laura", "De luca", LocalDate.of(1999, 10, 6), 99910);
        Utente giovanni = new Utente("Giovanni", "Alfonsi", LocalDate.of(2004, 3, 21), 99915);

       /* ud.save(marco);
        ud.save(laura);
        ud.save(giovanni);*/

        Prestito primoPrestito = new Prestito(marco, libro3, LocalDate.of(2025, 5, 26), LocalDate.of(2025, 7, 12));
        Prestito secondoPrestito = new Prestito(laura, rivista2, LocalDate.of(2025, 10, 5), LocalDate.of(2025, 7, 2));
        Prestito terzoPrestito = new Prestito(giovanni, rivista, LocalDate.of(2024, 11, 20), LocalDate.of(2024, 8, 10));
        Prestito quartoPrestito = new Prestito(laura, libro, LocalDate.of(2024, 4, 26), LocalDate.of(2024, 8, 10));
        Prestito quintoPrestito = new Prestito(marco, libro2, LocalDate.of(2024, 12, 14), LocalDate.of(2024, 12, 24));
        Prestito sestoPrestito = new Prestito(giovanni, rivista3, LocalDate.of(2024, 1, 9), LocalDate.of(2024, 11, 29));

        /*pd.save(primoPrestito);
        pd.save(secondoPrestito);
        pd.save(terzoPrestito);
        pd.save(quartoPrestito);
        pd.save(quintoPrestito);
        pd.save(sestoPrestito);*/


    }
}
