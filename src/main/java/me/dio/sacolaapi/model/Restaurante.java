package me.dio.sacolaapi.model;

import javax.persistence.*;

public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(Cascade=CascadeType.ALL)
    private List<Produto> cardapio;
    @Embedded
    private Endereço endereco;
}
