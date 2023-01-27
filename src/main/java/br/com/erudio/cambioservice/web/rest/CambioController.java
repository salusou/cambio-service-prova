package br.com.erudio.cambioservice.web.rest;

import br.com.erudio.cambioservice.service.CambioService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Cambio")
@RestController
@RequestMapping("cambio-service")
public class CambioController {


  private final CambioService cambioService;

  public CambioController(CambioService cambioService) {
    this.cambioService = cambioService;
  }

  //TODO: Implementar os métodos REST

}
