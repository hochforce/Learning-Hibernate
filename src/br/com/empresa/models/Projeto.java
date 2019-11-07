/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Nestor
 */
@Entity
@Table(name = "projeto")
public class Projeto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PROJ_COD")
    private Integer projCod;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "NOME_GERENTE")
    private String nomeGerente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "projCod")
    private List<Empregado> empregados;

    public Projeto() {
    }

    public Projeto(Integer projCod) {
        this.projCod = projCod;
    }

    public Integer getProjCod() {
        return projCod;
    }

    public void setProjCod(Integer projCod) {
        this.projCod = projCod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

    public List<Empregado> getEmpregados() {
        return empregados;
    }

    public void setEmpregados(List<Empregado> empregados) {
        this.empregados = empregados;
    }
}
