package cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.model.domain;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="sucursals")
public class Sucursal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sucursalID;
	
	
	@Column(name="nomSucursal")
	@NotEmpty(message="Cal introduir un nom")
	private String nomSucursal;
	
	@Column(name="paisSucursal")
	private String paisSucursal;

	
	
	
	
	
	public Sucursal(int sucursalID, String nomSucursal, String paisSucursal) {
		this.sucursalID = sucursalID;
		this.nomSucursal = nomSucursal;
		this.paisSucursal = paisSucursal;
	}

	public Sucursal() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Sucursal [sucursalID=" + sucursalID + ", nomSucursal=" + nomSucursal + ", paisSucursal=" + paisSucursal
				+ "]";
	}
	
	
	
}
