package com.mycompany.veterinariacanina.persistencia;

import com.mycompany.veterinariacanina.logica.Dueno;
import com.mycompany.veterinariacanina.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class DuenoJpaController implements Serializable {

    public DuenoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    //Algo aqui
    public DuenoJpaController() {
        emf = Persistence.createEntityManagerFactory("PeluCaninaPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Dueno dueno) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(dueno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Dueno dueno) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            dueno = em.merge(dueno);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = dueno.getId_dueno();
                if (findDueno(id) == null) {
                    throw new NonexistentEntityException("El dueño con el " + id + " no existe.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Dueno dueno;
            try {
                dueno = em.getReference(Dueno.class, id);
                dueno.getId_dueno();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("El dueño con el " + id + " no existe.", enfe);
            }
            em.remove(dueno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Dueno> findDuenoEntities() {
        return findDuenoEntities(true, -1, -1);
    }

    public List<Dueno> findDuenoEntities(int maxResults, int firstResult) {
        return findDuenoEntities(false, maxResults, firstResult);
    }

    private List<Dueno> findDuenoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Dueno.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Dueno findDueno(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Dueno.class, id);
        } finally {
            em.close();
        }
    }

    public int getDuenoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Dueno> rt = cq.from(Dueno.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
