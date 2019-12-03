package fr.dev.tp1.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.dev.tp1.model.Utilisateur;
import fr.dev.tp1.services.UtilisateurService;

/**
 * UtilisateurController.
 * @author nicolas.vivion
 *
 */
@RestController
@RequestMapping("/api/utilisateur")
@CrossOrigin(origins = "*")
public class UtilisateurController {

	private static final Logger LOGGER = Logger.getLogger(UtilisateurController.class);

	@Autowired
	private UtilisateurService utilisateurService;

	@GetMapping(value = "/test")
	public ResponseEntity<String> getTest() {
		LOGGER.info("getTest");
		return new ResponseEntity<String>("Test", HttpStatus.OK);
	}

	@GetMapping(value = "/utilisateur/{idUtilisateur}")
	public ResponseEntity<Utilisateur> getById(@PathVariable int idUtilisateur) {
		LOGGER.info("getById");
		Utilisateur utilisateur = utilisateurService.getById(idUtilisateur);
		return new ResponseEntity<Utilisateur>(utilisateur, HttpStatus.OK);
	}

	@GetMapping(value = "/utilisateurs")
	public ResponseEntity<List<Utilisateur>> getAll() {
		LOGGER.info("getAll");
		List<Utilisateur> utilisateurs = utilisateurService.getAll();
		return new ResponseEntity<List<Utilisateur>>(utilisateurs, HttpStatus.OK);
	}

	@PutMapping(value = "/utilisateur")
	public ResponseEntity<Boolean> update(@RequestBody Utilisateur utilisateur) {
		LOGGER.info("update");
		utilisateurService.update(utilisateur);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@PostMapping(value = "/utilisateur")
	public ResponseEntity<Boolean> create(@RequestBody Utilisateur utilisateur) {
		LOGGER.info("create");
		utilisateurService.add(utilisateur);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@DeleteMapping(value = "/utilisateur/{idUtilisateur}")
	public ResponseEntity<Boolean> delete(@PathVariable int idUtilisateur) {
		LOGGER.info("delete");
		utilisateurService.delete(idUtilisateur);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

}
