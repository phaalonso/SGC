/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author pedro
 */
@Entity
@Table(name = "assento")
@NamedQueries({
    @NamedQuery(name = "Assento.findAll",
            query = "SELECT a FROM Assento a"),
    @NamedQuery(name = "Assento.findByCodigo",
            query = "SELECT a FROM Assento a WHERE a.codigo = :codigo")
})
public class Assento implements Serializable{
    @Id
    private String codigo;
    
    @Id
    @ManyToOne
    @JoinColumn(referencedColumnName = "codigo")
    private Sala sala;
    
    @Column(name = "disponivel")
    private boolean disponivel;
 
    public Assento() {
    }

    public Assento(String codigo, Sala sala, boolean disponivel) {
        this.codigo = codigo;
        this.sala = sala;
        this.disponivel = disponivel;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    @Override
    public String toString() {
        return "Assento{" + "codigo=" + codigo + ", disponivel=" + disponivel + '}';
    }
}
