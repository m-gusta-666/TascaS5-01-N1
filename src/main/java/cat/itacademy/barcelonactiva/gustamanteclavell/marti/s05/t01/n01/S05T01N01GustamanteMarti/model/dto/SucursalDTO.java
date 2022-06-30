package cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.model.dto;

import java.util.List;

import cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.utils.Paisos;

public class SucursalDTO {

	private int sucursalID;
	private String nomSucursal;
	private String paisSucursal;
	private String tipusSucursal;

	

	public SucursalDTO(int sucursalID, String nomSucursal, String paisSucursal) {
		this.sucursalID = sucursalID;
		this.nomSucursal = nomSucursal;
		this.paisSucursal = paisSucursal;

		List<String> paisosUE = Paisos.getLlistaUE();

		if (paisosUE.contains(paisSucursal)) {
			tipusSucursal = "UE";
		} else {
			tipusSucursal = "Fora UE";
		}
	}

	public int getSucursalID() {
		return sucursalID;
	}

	public void setSucursalID(int sucursalID) {
		this.sucursalID = sucursalID;
	}

	public String getNomSucursal() {
		return nomSucursal;
	}

	public void setNomSucursal(String nomSucursal) {
		this.nomSucursal = nomSucursal;
	}

	public String getPaisSucursal() {
		return paisSucursal;
	}

	public void setPaisSucursal(String paisSucursal) {
		this.paisSucursal = paisSucursal;
	}

	public String getTipusSucursal() {
		return tipusSucursal;
	}

	public void setTipusSucursal(String tipusSucursal) {
		this.tipusSucursal = tipusSucursal;
	}
	
	
	
	

	@Override
	public String toString() {
		return "SucursalDTO [SucursalID=" + sucursalID + ", nomSucursal=" + nomSucursal + ", paisSucursal="
				+ paisSucursal + ", tipusSucursal=" + tipusSucursal + "]";
	}

	

}
