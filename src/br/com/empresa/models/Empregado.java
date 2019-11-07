/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Nestor
 */
@Entity
@Table(name = "empregado")
public class Empregado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EMP_MAT")
    private Integer empMat;
    @Column(name = "NOME")
    private String nome;
    @JoinColumn(name = "DEPT_COD", referencedColumnName = "DEPT_COD")
    @ManyToOne(optional = false)
    private Depto deptCod;
    @JoinColumn(name = "PROJ_COD", referencedColumnName = "PROJ_COD")
    @ManyToOne(optional = false)
    private Projeto projCod;

    public Empregado() {
    }

    public Empregado(Integer empMat) {
        this.empMat = empMat;
    }

    public Integer getEmpMat() {
        return empMat;
    }

    public void setEmpMat(Integer empMat) {
        this.empMat = empMat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Depto getDeptCod() {
        return deptCod;
    }

    public void setDeptCod(Depto deptCod) {
        this.deptCod = deptCod;
    }

    public Projeto getProjCod() {
        return projCod;
    }

    public void setProjCod(Projeto projCod) {
        this.projCod = projCod;
    }

}
