package cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.model.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.exceptions.*;
import cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.model.dto.SucursalDTO;
import cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.model.repository.SucursalRepository;

@Service
public class SucursalService {

	
	@Autowired
	SucursalRepository sucursalRepository;
	
	
	
	public List<SucursalDTO> getAll() {
		return sucursalRepository.findAll().stream().map(Mapper::toDTO).collect(Collectors.toList());
	}
	
	
	public Sucursal getOne(int id) {
		return sucursalRepository.findById(id).orElseThrow(SucursalNoTrobadaException::new);
	}
	
	
	public SucursalDTO getOneDTO(int id) {
		Sucursal sucursal = sucursalRepository.findById(id).orElseThrow(SucursalNoTrobadaException::new);
		return Mapper.toDTO(sucursal);
	}
	
	
	public void add(Sucursal sucursal) {
		sucursalRepository.save(sucursal);
	}
	
	
	public void delete(int id) {
		Sucursal sucursal = sucursalRepository.findById(id).orElseThrow(SucursalNoTrobadaException::new);
		sucursalRepository.deleteById(id);
	}
	
}
