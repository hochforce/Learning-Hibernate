
package br.com.empresa.models;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
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
@Table(name = "depto")
public class Depto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEPT_COD")
    private Integer deptCod;
    @Column(name = "NOME")
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deptCod")
    private List<Empregado> empregados;

    public Depto() {
    }

    public Depto(Integer deptCod) {
        this.deptCod = deptCod;
    }

    public Integer getDeptCod() {
        return deptCod;
    }

    public void setDeptCod(Integer deptCod) {
        this.deptCod = deptCod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Empregado> getEmpregados() {
        return empregados;
    }

    public void setEmpregados(List<Empregado> empregados) {
        this.empregados = empregados;
    }
    

}
