package co.edu.usbcali.aerolinea.repository;

import co.edu.usbcali.aerolinea.domain.Aeropuerto;
import co.edu.usbcali.aerolinea.domain.TipoAsiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoAsientoRepository extends JpaRepository<TipoAsiento, Long> {
}