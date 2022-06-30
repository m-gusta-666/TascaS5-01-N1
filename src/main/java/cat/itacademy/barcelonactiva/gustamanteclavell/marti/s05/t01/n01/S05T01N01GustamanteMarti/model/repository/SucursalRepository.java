package cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n01.S05T01N01GustamanteMarti.model.domain.Sucursal;

@Repository
public interface SucursalRepository extends JpaRepository<Sucursal,Integer>{

}
