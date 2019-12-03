package fr.dev.tp1.repositoires;

import java.util.List;

import fr.dev.tp1.model.Utilisateur;

public interface UtilisateurRepositories {

	/**
	 * getById.
	 * 
	 * @param id
	 * @return
	 */
	public Utilisateur getById(Integer id);

	/**
	 * getAll.
	 * 
	 * @return
	 */
	public List<Utilisateur> getAll();

	/**
	 * add.
	 * 
	 * @param utilisateur
	 * @return
	 */
	public void add(Utilisateur utilisateur);

	/**
	 * update.
	 * 
	 * @param utilisateur
	 * @return
	 */
	public void update(Utilisateur utilisateur);

	/**
	 * delete.
	 * 
	 * @param id
	 * @return
	 */
	public void delete(Integer id);
}
