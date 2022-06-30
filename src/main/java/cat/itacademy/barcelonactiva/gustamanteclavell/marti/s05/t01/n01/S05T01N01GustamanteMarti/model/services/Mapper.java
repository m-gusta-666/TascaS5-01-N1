package cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.model.services;

import org.springframework.stereotype.Component;

import cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.model.dto.SucursalDTO;

@Component
public class Mapper {

	public static SucursalDTO toDTO(Sucursal sucursal) {
		return new SucursalDTO(sucursal.getSucursalID(),sucursal.getNomSucursal(),sucursal.getPaisSucursal());
	}
	
	
	public static Sucursal toSucursal(SucursalDTO sucursalDTO) {
		return new Sucursal(sucursalDTO.getSucursalID(),sucursalDTO.getNomSucursal(),sucursalDTO.getPaisSucursal());
	}
}
