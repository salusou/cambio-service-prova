package br.com.erudio.cambioservice.repository;

import br.com.erudio.cambioservice.domain.Cambio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CambioRepository extends JpaRepository<Cambio, Long> {
  Optional<Cambio> findByFromAndTo(String from, String to);

  List<Cambio> findByTo(String to);
}
