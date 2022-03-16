package com.carlosdev.lojavirtual.entities;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name= "funcionario")
@Data
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private Double SalarioBruto;

    // ESTOU INFORMANDO QUE VOU ADICIONAR SOMENTE A DATA, PORÉM A ANOTAÇÃO PERMITE OUTROS PARAMS
    @Temporal(TemporalType.DATE)
    private Date dataEntrada;

    @Temporal(TemporalType.DATE)
    private Date dataSaida;
    private String cargo;
    private String cidade;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String uf;
    private String cep;

    /*public Funcionario(){
        super();
    }*/








}
