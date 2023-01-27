package br.com.erudio.cambioservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//TODO: habilitar agendamento
public class CambioServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(CambioServiceApplication.class, args);
  }

}
