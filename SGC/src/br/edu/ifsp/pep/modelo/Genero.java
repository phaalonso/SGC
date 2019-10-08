/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "genero")
@NamedQueries({
    @NamedQuery(name = "Genero.findAll", 
            query = "SELECT g FROM Genero g"),
    @NamedQuery(name = "Genero.findByCodigo", 
            query = "SELECT g FROM Genero g WHERE g.codigo = :codigo")
})
public class Genero implements Serializable {
    @Id
    @Column(name = "codigo")
    private Integer codigo;
    
    @Column(name = "descricao", length = 25, nullable = false)
    private String descricao;

    public Genero() {
    }

    public Genero(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}