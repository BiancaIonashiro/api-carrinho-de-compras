package me.dio.sacolaapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import me.dio.sacolaapi.enumeration.FormaPagamento;

import javax.persistence.*;

public class Sacola {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    Private Cliente cliente;
    @OneToMany(Cascade=CascadeType.ALL)
    Private List<Item> items;
    private Double valorTotal;

    @Inumerated
    private FormaPagamento FormaPagamento;
    private Boolean fechada;
}
