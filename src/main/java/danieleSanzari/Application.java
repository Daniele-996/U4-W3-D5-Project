package danieleSanzari;

import danieleSanzari.DAO.ElementoGenericoDAO;
import danieleSanzari.DAO.PrestitoDAO;
import danieleSanzari.DAO.UtenteDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4-w3-d5-project-pu");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        ElementoGenericoDAO egd = new ElementoGenericoDAO(em);
        UtenteDAO ud = new UtenteDAO(em);
        PrestitoDAO pd = new PrestitoDAO(em);


    }
}
