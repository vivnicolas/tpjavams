package fr.dev.tp1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Utilisateur.
 * 
 * @author nicolas.vivion
 *
 */
@Entity
@Table(name = "utilisateur")
public class Utilisateur implements java.io.Serializable {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nom;

	/**
	 * Utilisateur.
	 */
	public Utilisateur() {
		super();
	}

	/**
	 * Utilisateur.
	 * 
	 * @param id
	 * @param nom
	 */
	public Utilisateur(Integer id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	/**
	 * @return the id
	 */
	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	@Column(name = "nom")
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

}
