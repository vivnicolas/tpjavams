package fr.dev.tp1.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.dev.tp1.model.Utilisateur;
import fr.dev.tp1.repositoires.UtilisateurRepositories;

/**
 * UtilisateurServiceImpl.
 * @author nicolas.vivion
 *
 */
@Service
public class UtilisateurServiceImpl implements UtilisateurService {

	private static final Logger LOGGER = Logger.getLogger(UtilisateurServiceImpl.class);
	
	@Autowired
	private UtilisateurRepositories utilisateurRepositories;
	
	@Transactional
	public Utilisateur getById(Integer id) {
		LOGGER.info("getById");
		return utilisateurRepositories.getById(id);
	}
	
	@Transactional
	public List<Utilisateur> getAll() {
		return utilisateurRepositories.getAll();
	}

	@Transactional
	public void add(Utilisateur utilisateur) {
		utilisateurRepositories.add(utilisateur);
	}

	@Transactional
	public void update(Utilisateur utilisateur) {
		utilisateurRepositories.update(utilisateur);
	}

	@Transactional
	public void delete(Integer id) {
		utilisateurRepositories.delete(id);
	}

}
