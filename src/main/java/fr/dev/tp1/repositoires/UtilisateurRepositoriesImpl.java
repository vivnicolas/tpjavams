package fr.dev.tp1.repositoires;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.dev.tp1.model.Utilisateur;

/**
 * UtilisateurRepositoriesImpl.
 * 
 * @author nicolas.vivion
 *
 */
@Repository
public class UtilisateurRepositoriesImpl implements UtilisateurRepositories {

	private static final Logger LOGGER = Logger.getLogger(UtilisateurRepositoriesImpl.class);

	private String queryGetAll = "SELECT * FROM utilisateur";
	private String queryGetById = "SELECT * FROM utilisateur WHERE id = :idUtilisateur";
	private String queryDelete = "DELETE FROM utilisateur where id = :idUtilisateur";
	private String queryUpdate = "UPDATE utilisateur SET nom = :nomUtilisateur WHERE id = :idUtilisateur";
	private String queryInsert = "INSERT INTO utilisateur (nom) VALUES (:nomUtilisateur)";

	@Autowired
	private SessionFactory sessionFactory;

	public Utilisateur getById(Integer id) {
		LOGGER.info("getById");
		Utilisateur utilsateur;
		try {
			utilsateur = (Utilisateur) this.sessionFactory.getCurrentSession().createNativeQuery(this.queryGetById)
					.setParameter("idUtilisateur", id).addEntity(Utilisateur.class);
		} catch (NoResultException e) {
			LOGGER.error("Aucun résultat en base de données", e);
			return new Utilisateur();
		} catch (Exception e) {
			LOGGER.error(e);
			return new Utilisateur();
		}
		return utilsateur;
	}

	@SuppressWarnings("unchecked")
	public List<Utilisateur> getAll() {
		List<Utilisateur> attributs;
		try {
			attributs = (List<Utilisateur>) this.sessionFactory.getCurrentSession().createNativeQuery(this.queryGetAll)
					.addEntity(Utilisateur.class).getResultList();
		} catch (NoResultException e) {
			LOGGER.error("Aucun résultat en base de données", e);
			return new ArrayList<Utilisateur>();
		} catch (Exception e) {
			LOGGER.error(e);
			return new ArrayList<Utilisateur>();
		}
		return attributs;

	}

	public void add(Utilisateur utilisateur) {
		try {
			this.sessionFactory.getCurrentSession().createNativeQuery(this.queryInsert)
					.setParameter("nomUtilisateur", utilisateur.getNom()).executeUpdate();
		} catch (NoResultException e) {
			LOGGER.error("Aucun résultat en base de données", e);
		} catch (Exception e) {
			LOGGER.error(e);
		}

	}

	public void update(Utilisateur utilisateur) {
		try {
			this.sessionFactory.getCurrentSession().createNativeQuery(this.queryUpdate)
					.setParameter("nomUtilisateur", utilisateur.getNom())
					.setParameter("idUtilisateur", utilisateur.getId()).executeUpdate();
		} catch (NoResultException e) {
			LOGGER.error("Aucun résultat en base de données", e);
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}

	public void delete(Integer id) {
		try {
			this.sessionFactory.getCurrentSession().createNativeQuery(this.queryDelete)
					.setParameter("idUtilisateur", id).executeUpdate();
		} catch (NoResultException e) {
			LOGGER.error("Aucun résultat en base de données", e);
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}

}
