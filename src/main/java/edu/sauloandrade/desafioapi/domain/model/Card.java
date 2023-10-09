package edu.sauloandrade.desafioapi.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_card")
public class Card {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit", scale = 13, precision = 2)
    private BigDecimal limit;
    
    // Getters
    public Long getId() {return id;}
    public String getNumber() {return number;}
    public BigDecimal getLimit() {return limit;}

    // Setters
    public void setId(Long id) {this.id = id;}
    public void setNumber(String number) {this.number = number;}
    public void setLimit(BigDecimal limit) {this.limit = limit;}
}
