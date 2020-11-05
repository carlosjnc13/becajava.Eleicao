package br.eleicao.app.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.eleicao.app.model.Candidato;
import br.eleicao.app.repository.CandidatoRepository;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {
	
	final CandidatoRepository _candidatoRepository;
	
	public CandidatoController(CandidatoRepository candidatoRepository) {
		_candidatoRepository = candidatoRepository;
	}
	@PostMapping
	public ResponseEntity inserir(@RequestBody Candidato candidato) {
		_candidatoRepository.save(candidato);
		return ResponseEntity.status(HttpStatus.CREATED).body("Candidato Criado!!");
	}
	@GetMapping
	public ResponseEntity listar() {
		Iterable<Candidato> candidato = _candidatoRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(candidato);
	}
	@GetMapping(path = "/{id}")
	public ResponseEntity obter(@PathVariable Long id) {
		Optional<Candidato> candidato = _candidatoRepository.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(candidato);
	}
	@PutMapping(path = "/{id}")
	public ResponseEntity atualizar(@RequestBody Candidato candidato,@PathVariable Long id) {
		candidato.setId(id);
		_candidatoRepository.save(candidato);
		return ResponseEntity.status(HttpStatus.OK).body("Candidato Atualizado!!");
	}
	@DeleteMapping(path = "/{id}")
	public ResponseEntity deletar(@PathVariable Long id) {
		_candidatoRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}
