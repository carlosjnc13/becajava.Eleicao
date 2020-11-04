package br.eleicao.app;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.eleicao.app.model.Candidato;
import br.eleicao.app.model.Eleitor;
import br.eleicao.app.model.Municipio;
import br.eleicao.app.model.Voto;
import br.eleicao.app.model.Zona;
import br.eleicao.app.repository.CandidatoRepository;
import br.eleicao.app.repository.EleitorRepository;
import br.eleicao.app.repository.MunicipioRepository;
import br.eleicao.app.repository.VotoRepository;
import br.eleicao.app.repository.ZonaRepository;


@SpringBootApplication
public abstract class Eleicao1Application implements CommandLineRunner {
	
	final MunicipioRepository _municipioRepository;
	final CandidatoRepository _candidatoRepository;
	final EleitorRepository _eleitorRepository;
	final VotoRepository _votoRepository;
	final ZonaRepository _zonaRepository;
	
	public Eleicao1Application(
			ZonaRepository zonaRepository,
			CandidatoRepository candidatoRepository,
			MunicipioRepository municipioRepository,
			EleitorRepository eleitorRepository,
			VotoRepository votoRepository){
		
		_eleitorRepository = eleitorRepository;
		_candidatoRepository = candidatoRepository;
		_municipioRepository = municipioRepository;
		_votoRepository = votoRepository;
		_zonaRepository = zonaRepository;}
	
	public static void main(String[] args) {
		SpringApplication.run(Eleicao1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

// ----------------------CANDIDATO.-----------------------------------
		//Salvar Candidato
//		Candidato candidato = new Candidato();
//		candidato.setNome("Adailto");
//		candidato.setNumero("2675");
//		candidato.setTipo("Vereador");
//		//candidato.setMunicipio();
//		_candidatoRepository.save(candidato);
//		System.out.println("Candidato salvo com sucesso!");	
		
		//Deletando um Candidato
//		Candidato candidato = new Candidato();		
//		candidato.setId(new Long(1));
//		_candidatoRepository.delete(candidato);;
//		System.out.println("Candidato deletado com sucesso!");
		
		//Atualizando um Candidato
//		Candidato candidato = new Candidato();
//		candidato.setId(new Long(2));
//		candidato.setNome("Carlos");
//		candidato.setNumero("2626");
//		candidato.setTipo("Deputado");
//		_candidatoRepository.save(candidato);		
//		System.out.println("Candidato atualizado com sucesso!");
		
		//Selecionando apenas UM Candidato
//		Optional<Candidato> candidato = _candidatoRepository.findById(new Long(3));
//		System.out.println("Município: " + candidato.get().getNome());
		
		//Selecionando todos os Candidatos
//		Iterable<Candidato> candidatos = _candidatoRepository.findAll();		
//		for(Candidato m : candidatos) {
//			System.out.println("Município: " + m.getNome());}
		
		
// ----------------------ELEITOR.-----------------------------------
		//Salvar Eleitor
//		Eleitor eleitor = new Eleitor();
//		eleitor.setNome("Wellington");
//		_eleitorRepository.save(eleitor);
//		System.out.println("Eleitor salvo com sucesso!");
		
		//Deletando um Eleitor
//		Eleitor eleitor = new Eleitor();		
//		eleitor.setId(new Long(1));
//		_eleitorRepository.delete(eleitor);;
//		System.out.println("Eleitor deletado com sucesso!");
		
		//Atualizando um Eleitor
//		Eleitor eleitor = new Eleitor();
//		eleitor.setId(new Long(2));
//		eleitor.setNome("Carlos");
//		_eleitorRepository.save(eleitor);		
//		System.out.println("Eleitor atualizado com sucesso!");
		
		//Selecionando apenas UM Eleitor
//		Optional<Eleitor> eleitor = _eleitorRepository.findById(new Long(2));
//		System.out.println("Eleitor: " + eleitor.get().getNome());
		
		//Selecionando todos os Eleitores
//		Iterable<Eleitor> eleitores = _eleitorRepository.findAll();		
//		for(Eleitor e : eleitores) {
//			System.out.println("Eleitores: " + e.getNome());}
		
		
// ----------------------VOTO.-----------------------------------
		//Salvar Voto
//		Voto voto = new Voto();
//		voto.setCandidato(candidato);
//		voto.setEleitor(eleitor);
//		_votoRepository.save(voto);
//		System.out.println("Voto salvo com sucesso!");
		
		//Deletando um Voto
//		Voto voto = new Voto();		
//		voto.setId(new Long(1));
//		_votoRepository.delete(voto);;
//		System.out.println("Voto deletado com sucesso!");
		
		//Atualizando um Voto
//		Voto voto = new Voto();
//		voto.setId(new Long(2));
//		voto.setCandidato(candidato);
//		voto.setEleitor(eleitor);
//		_votoRepository.save(eleitor);		
//		System.out.println("Voto atualizado com sucesso!");
		
		//Selecionando apenas UM Voto
//		Optional<Voto> voto = _votoRepository.findById(new Long(2));
//		System.out.println("Voto: " + voto.get().getCandidatoId());
		
		//Selecionando todos os Votos
//		Iterable<Votos> votos = _votosRepository.findAll();		
//		for(Votos e : votos) {
//			System.out.println("Votos: " + e.getNome());}
		
			
// ----------------------ZONA.-----------------------------------
		//Salvar Zona
//		Zona zona = new Zona();
//		zona.setNumero(455);
//		_zonaRepository.save(zona);
//		System.out.println("Zona salva com sucesso!");
		
		//Deletando um Zona
//		Zona zona = new Zona();		
//		zona.setId(new Long(1));
//		_zonaRepository.delete(zona);;
//		System.out.println("Zona deletada com sucesso!");
		
		//Atualizando Zona
//		Zona zona = new Zona();
//		zona.setId(new Long(2));
//		zona.setNumero(788);
//		_zonaRepository.save(zona);		
//		System.out.println("Zona atualizada com sucesso!");
		
		//Selecionando apenas UMA zona
//		Optional<Zona> zona = _zonaRepository.findById(new Long(2));
//		System.out.println("Zona: " + zona.get().getNumero());
		
		//Selecionando todos as Zonas
//		Iterable<Zona> zonas = _zonaRepository.findAll();		
//		for(Zona e : zonas) {
//			System.out.println("Zonas: " + e.getNumero());}
		
				
// ----------------------MUNICIPIO.-----------------------------------
		//Salvar Município
//		Municipio municipio = new Municipio();
//		municipio.setNome("São Paulo");
//		municipio.setPopulacao(14000000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		
//		
//		municipio = new Municipio();
//		municipio.setNome("Sorocaba");
//		municipio.setPopulacao(140000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		
//		
//		municipio = new Municipio();
//		municipio.setNome("Guarulhos");
//		municipio.setPopulacao(1400000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		
		
		//Deletando um município
//		Municipio municipio = new Municipio();		
//		municipio.setId(new Long(3));
//		_municipioRepository.delete(municipio);;
//		System.out.println("Município deletado com sucesso!");
		
		//Atualizando um município
//		Municipio municipio = new Municipio();
//		municipio.setId(new Long(2));
//		municipio.setNome("São Paulo - Capital");
//		municipio.setPopulacao(14000000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município atualizado com sucesso!");	
			
		//Selecionando apenas UM município
//		Optional<Municipio> municipio = _municipioRepository.findById(new Long(4));
//		System.out.println("Município: " + municipio.get().getNome());
		
		//Selecionando todos os municípios
//		Iterable<Municipio> municipios = _municipioRepository.findAll();		
//		for(Municipio m : municipios) {
//			System.out.println("Município: " + m.getNome());}
		
	}
}
