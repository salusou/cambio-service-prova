package br.com.erudio.cambioservice.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Entity(name = "cambio")
public class Cambio implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "from_currency", nullable = false, length = 3)
  private String from;

  @Column(name = "to_currency", nullable = false, length = 3)
  private String to;

  @Column(nullable = false)
  private BigDecimal conversionFactor;

  @Transient
  private BigDecimal conversionValue;

  @Transient
  private String environment;

}
