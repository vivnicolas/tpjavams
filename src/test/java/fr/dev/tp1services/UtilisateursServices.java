package fr.dev.tp1services;

import java.util.List;

import fr.dev.tp1.model.Utilisateur;

/**
 * 
 * @author nicolas.vivion
 *
 */
public interface UtilisateursServices {

	/**
	 * getUtilisateur.
	 * @param id
	 * @return
	 */
	public Utilisateur getUtilisateur(Integer id);
	
	/**
	 * getUtilisateurs.
	 * @return
	 */
	public List<Utilisateur> getUtilisateurs();
	
	/**
	 * updateUtilisateur.
	 * @param id
	 * @return
	 */
	public Utilisateur updateUtilisateur(Utilisateur utilisateur);
	
	/**
	 * addUtilisateur.
	 * @param utilisateur
	 * @return
	 */
	public boolean addUtilisateur(Utilisateur utilisateur);
	
	/**
	 * delUtilisateur.	
	 * @param id
	 * @return
	 */
	public boolean delUtilisateur(Integer id);
	
}
