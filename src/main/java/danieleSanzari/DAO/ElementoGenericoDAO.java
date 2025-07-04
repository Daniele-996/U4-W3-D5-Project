package danieleSanzari.DAO;

import danieleSanzari.entities.ElementoGenerico;
import danieleSanzari.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class ElementoGenericoDAO {
    private final EntityManager entityManager;

    public ElementoGenericoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(ElementoGenerico newEl) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newEl);
        transaction.commit();

        System.out.println("L'elemento " + newEl.getTitolo() + " è stato creato correttamente!!");
    }

    public ElementoGenerico findById(String elementoId) {
        ElementoGenerico found = entityManager.find(ElementoGenerico.class, UUID.fromString(elementoId));
        if (found == null) throw new NotFoundException(elementoId);
        return found;
    }
}
