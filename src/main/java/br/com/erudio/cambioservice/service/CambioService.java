package br.com.erudio.cambioservice.service;

import br.com.erudio.cambioservice.repository.CambioRepository;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class CambioService {

  private final Environment environment;
  private final CambioRepository cambioRepository;

  public CambioService(Environment environment, CambioRepository cambioRepository) {
    this.environment = environment;
    this.cambioRepository = cambioRepository;
  }

  // Todo: Implementar os serviços

}
