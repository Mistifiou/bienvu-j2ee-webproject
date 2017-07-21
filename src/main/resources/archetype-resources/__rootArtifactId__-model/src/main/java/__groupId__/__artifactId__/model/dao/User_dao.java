package ${groupId}.${artifactId}.model.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import ${groupId}.${artifactId}.model.entities.User_entity;

/**
 * DAO database, CRUD sur les entitées database
 * 
 * @author mistifiou
 * @see User_entity
 */
@Stateless
public class User_dao implements Serializable {
	private static final long serialVersionUID = 1L; //TODO : change serial version

	///////////////////////////////
	////// REQUETE SELECT ALL ///
	private static final String JPQL_SELECT_ALL = "SELECT u FROM E_User u";
	///////////////////////////////

	///////////////////////////////
	////// REQUETE SELECT BY ID ///
	private static final String PARAM_ID = "id";
	///////////////////////////////

	///////////////////////////////////////////////////////////////////////
	// Injection du manager, qui s'occupe de la connexion avec la BDD /////
	@PersistenceContext(unitName = "${artifactId}-pu")
	private EntityManager em;
	///////////////////////////////////////////////////////////////////////

	/**
	 * Enregistrer en persistance une nouvelle base de données
	 * 
	 * @param entity
	 * @throws DAOException
	 */
	public void create(User_entity entity) throws DAOException {
		try {
			em.persist(entity);
		} catch (Exception e) {
			throw new DAOException(e);
		}
	}

	/**
	 * Mettre à jour une base de donnée existante
	 * 
	 * @param entity
	 * @throws DAOException
	 */
	public void update(User_entity entity) throws DAOException {
		try {
			em.merge(entity);
		} catch (Exception e) {
			throw new DAOException(e);
		}
	}

	/**
	 * Supprimer une base de donnée
	 * 
	 * @param entity
	 * @throws DAOException
	 */
	public void delete(User_entity database) throws DAOException {
		try {
			em.remove(database);
		} catch (Exception e) {
			throw new DAOException(e);
		}
	}	

	/**
	 * Récupérer les bases de donnée
	 * 
	 * @return la liste des entity organisées par nom
	 * @throws DAOException
	 */
	public List<User_entity> list() throws DAOException {
		try {
			TypedQuery<User_entity> requete = em.createQuery(JPQL_SELECT_ALL, E_Modele.class);
			return requete.getResultList();
		} catch (NoResultException e) {
			System.out.println("NO RESULT FOR REQUEST " + JPQL_SELECT_ALL);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DAOException(e);
		}
		return new ArrayList<User_entity>();
	}

	
}
