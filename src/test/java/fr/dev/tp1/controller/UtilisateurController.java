package fr.dev.tp1.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/utilisateur")
@CrossOrigin(origins = "*")
public class UtilisateurController {

	private static final Logger LOGGER = Logger.getLogger(UtilisateurController.class);

/*
	@GetMapping(value = "/thematiques")
	public ResponseEntity<List<ThematiqueDTO>> getThematiques() {

		List<ThematiqueDTO> thematiques = this.thematiqueService.getThematiques();

		return new ResponseEntity<>(thematiques, HttpStatus.OK);
	}

		
	@PutMapping(value = "/thematique")
	public ResponseEntity<ThematiqueDTO> createThematique(@RequestBody ThematiqueDTO thematiqueDTO) {

		ThematiqueDTO newThematique = new ThematiqueDTO();

		try {
			newThematique = this.thematiqueService.createThematique(thematiqueDTO);
		} catch (Exception error) {
			newThematique.setCodeErreur(ConstantesErreurs.ERR_COMMUN_ENREGISTREMENT);	
			if (error.getCause() instanceof ConstraintViolationException) {
				ConstraintViolationException errorConst = (ConstraintViolationException) error.getCause();
				if (ConstantesErreurs.KEY_THE_NOM.equalsIgnoreCase(errorConst.getConstraintName())) {
					newThematique.setCodeErreur(ConstantesErreurs.ERR_THE_NOM);		
				}
			}
			ThematiqueController.LOGGER.error(error.getMessage(),error.getCause());
			return new ResponseEntity<>(newThematique, HttpStatus.BAD_REQUEST);
		}

		// pas d'erreur
		if (newThematique.getCodeErreur() == null) {
			return new ResponseEntity<>(newThematique, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(newThematique, HttpStatus.BAD_REQUEST);
		}		
	}
	
	@PostMapping(value = "/thematique")
	public ResponseEntity<ThematiqueDTO> updateThematique(@RequestBody ThematiqueDTO thematiqueDTO) {

		ThematiqueDTO newThematique = new ThematiqueDTO();

		try {
			newThematique = this.thematiqueService.updateThematique(thematiqueDTO);
		} catch (Exception error) {
			newThematique.setCodeErreur(ConstantesErreurs.ERR_COMMUN_ENREGISTREMENT);	
			if (error.getCause() instanceof ConstraintViolationException) {
				ConstraintViolationException errorConst = (ConstraintViolationException) error.getCause();
				if (ConstantesErreurs.KEY_THE_NOM.equalsIgnoreCase(errorConst.getConstraintName())) {
					newThematique.setCodeErreur(ConstantesErreurs.ERR_THE_NOM);		
				}
			}
			ThematiqueController.LOGGER.error(error.getMessage(),error.getCause());
			return new ResponseEntity<>(newThematique, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(newThematique, HttpStatus.OK);
	}
	@DeleteMapping(value = "/thematique/idThematique/{idThematique}")
	public ResponseEntity<ThematiqueDTO> deleteThematique(@PathVariable int idThematique) {

		ThematiqueDTO remove = new ThematiqueDTO();

		try {
			remove = this.thematiqueService.deleteThematique(idThematique);
		} catch (Exception error) {
			remove.setCodeErreur(ConstantesErreurs.ERR_THE_DELETE);			
			ThematiqueController.LOGGER.error(error.getMessage(), error.getCause());
			return new ResponseEntity<>(remove, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(remove, HttpStatus.OK);
	}
*/

	
}
